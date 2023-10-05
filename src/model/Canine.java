package model;

public abstract class Canine extends Animal {

    public Canine(String name, String food, String habitat) {
        super(name, food, habitat);
    }

    @Override
    public void roam() {
        System.out.println("The Canine is roaming");
    }
}
