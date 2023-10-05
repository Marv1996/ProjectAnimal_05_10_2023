package model;

public class Lion extends Feline {

    public Lion(String name, String food, String habitat) {
        super(name, food, habitat);
    }

    @Override
    public void makeNoise() {
        System.out.println("grraaaauuuu!");
    }

    @Override
    public void eat() {
        System.out.println("The Lion is eating " + super.getFood());
    }

    @Override
    public String toString() {
        return "name: " + super.getName()
                + " | food: " + super.getFood()
                + " | habitat: " + super.getHabitat()
                + " | isHunger: " + super.getHunger();
    }
}
