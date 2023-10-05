package model;

public abstract class Feline extends Animal {

    public Feline(String name, String food, String habitat) {
        super(name, food, habitat);
    }

    @Override
    public void roam() {
        System.out.println("The Feline is roaming");
    }
}
