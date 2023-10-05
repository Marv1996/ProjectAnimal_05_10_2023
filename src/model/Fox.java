package model;

public class Fox extends Canine {

    public Fox(String name, String food, String habitat) {
        super(name, food, habitat);
    }

    @Override
    public void makeNoise() {
        System.out.println("wow wow wow");
    }

    @Override
    public void eat() {
        System.out.println("The Fox is eating " + super.getFood());
    }

    @Override
    public String toString() {
        return "name: " + super.getName()
                + " | food: " + super.getFood()
                + " | habitat: " + super.getHabitat()
                + " | isHunger: " + super.getHunger();
    }
}
