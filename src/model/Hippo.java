package model;

public class Hippo extends Animal {

    public Hippo(String name, String food, String habitat) {
        super(name, food, habitat);
    }

    @Override
    public void makeNoise() {
        System.out.println("Grunt! Grunt!");
    }

    @Override
    public void eat() {
        System.out.println("The Hippo is eating " + super.getFood());
    }

    @Override
    public String toString() {
        return "name: " + super.getName()
                + " | food: " + super.getFood()
                + " | habitat: " + super.getHabitat()
                + " | isHunger: " + super.getHunger();
    }
}
