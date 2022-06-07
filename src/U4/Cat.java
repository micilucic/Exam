package U4;

public class Cat extends Animal {

    public Cat (String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Sneeking around...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meeeow!");
    }
}
