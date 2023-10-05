package model;

public abstract class Animal {

    private String name;
    private String food;
    private String habitat;
    private Boolean isHunger = false;

    public Animal(String name, String food, String habitat) {
        this.name = name;
        this.food = food;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Boolean getHunger() {
        return isHunger;
    }

    public void setHunger(Boolean hunger) {
        isHunger = hunger;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void roam() {
        System.out.println("The Animal is roaming");
    }

    public void isSleep() {
        System.out.println("The Animal is sleeping");
    }
}
