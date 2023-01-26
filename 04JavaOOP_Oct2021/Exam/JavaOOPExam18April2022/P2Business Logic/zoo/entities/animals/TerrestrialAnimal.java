package zoo.entities.animals;

public class TerrestrialAnimal extends BaseAnimal{
    private static final double INITIAL_KG = 5.50;

    public TerrestrialAnimal(String name, String kind, double price) {
        super(name, kind, INITIAL_KG, price);
    }

    @Override
    public void eat() {
        double increases = 5.70;
        super.setKg(INITIAL_KG + increases);
    }
}
