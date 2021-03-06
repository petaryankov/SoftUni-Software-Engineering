package day10WhileLoopExercise;

import java.util.Scanner;

public class P1OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();
        String currentBook = scanner.nextLine();

        int counter = 0;
        while (!favoriteBook.equals(currentBook)) {
            counter++;
            currentBook = scanner.nextLine();
            if (currentBook.equals("No More Books")) {
                break;
            }
        }
        if (currentBook.equals("No More Books")) {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n", counter);
        } else {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}
