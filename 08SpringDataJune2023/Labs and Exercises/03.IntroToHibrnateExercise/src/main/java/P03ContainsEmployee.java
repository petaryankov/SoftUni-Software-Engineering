import entities.Employee;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class P03ContainsEmployee {
    public static void main(String[] args) {
        final EntityManager entityManager = Utils.createEntityManager();
        final Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();

        entityManager.getTransaction().begin();

        final String isEmployeePresented = entityManager
                .createQuery("from Employee where concat_ws(' ', first_name, last_name) = :fullName", Employee.class)
                .setParameter("fullName", inputName)
                .getResultList().isEmpty() ? "No" : "Yes";

        entityManager.getTransaction().commit();

        System.out.println(isEmployeePresented);
    }

}
