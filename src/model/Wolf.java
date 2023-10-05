package model;

public class Wolf extends Canine {

    public Wolf(String name, String food, String habitat) {
        super(name, food, habitat);
    }

    @Override
    public void makeNoise() {
        System.out.println("Hooooowl!");
    }

    @Override
    public void eat() {
        System.out.println("The Wolf is eating " + super.getFood());
    }

    @Override
    public String toString() {
        return "name: " + super.getName()
                + " | food: " + super.getFood()
                + " | habitat: " + super.getHabitat()
                + " | isHunger: " + super.getHunger();
    }
}
