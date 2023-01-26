package day6.InheritanceExercises.P6.Animals;

public class Tomcat extends Cat{
    private final static String GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
