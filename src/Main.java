import model.*;

public class Main {
    public static void main(String[] args) {

        Hippo hippo = new Hippo("Hippo", "grass", "water");
        hippo.setHunger(true);
        System.out.println(hippo);
        hippo.eat();
        hippo.makeNoise();
        hippo.roam();
        hippo.isSleep();
        System.out.println("--------------------------------------");

        Wolf wolf = new Wolf("Wolf", "meat", "temperate forests");
        wolf.setHunger(true);
        System.out.println(wolf);
        wolf.eat();
        wolf.makeNoise();
        wolf.roam();
        wolf.isSleep();
        System.out.println("--------------------------------------");

        Fox fox = new Fox("Fox", "rodents", "grassland");
        fox.setHunger(false);
        System.out.println(fox);
        fox.eat();
        fox.makeNoise();
        fox.roam();
        fox.isSleep();
        System.out.println("--------------------------------------");

        Lion lion = new Lion("Lion", "meat", "open grasslands");
        lion.setHunger(true);
        System.out.println(lion);
        lion.eat();
        lion.makeNoise();
        lion.roam();
        lion.isSleep();
        System.out.println("--------------------------------------");

        Cheetah cheetah = new Cheetah("Cheetah", "meat", "savannah");
        cheetah.setHunger(false);
        System.out.println(cheetah);
        cheetah.eat();
        cheetah.makeNoise();
        cheetah.roam();
        cheetah.isSleep();
        System.out.println("--------------------------------------");

        Lynx lynx = new Lynx("Lynx", "meat", "boreal forests");
        lynx.setHunger(false);
        System.out.println(lynx);
        lynx.eat();
        lynx.makeNoise();
        lynx.roam();
        lynx.isSleep();
        System.out.println("--------------------------------------");
    }
}