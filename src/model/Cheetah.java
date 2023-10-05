package model;

public class Cheetah extends Feline {

    public Cheetah(String name, String food, String habitat) {
        super(name, food, habitat);
    }

    @Override
    public void makeNoise() {
        System.out.println("yow");
    }

    @Override
    public void eat() {
        System.out.println("The Cheetah is eating " + super.getFood());
    }

    @Override
    public String toString() {
        return "name: " + super.getName()
                + " | food: " + super.getFood()
                + " | habitat: " + super.getHabitat()
                + " | isHunger: " + super.getHunger();
    }
}
