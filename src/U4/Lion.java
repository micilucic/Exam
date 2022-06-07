package U4;

public class Lion extends Animal{
    public Lion (String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Chasing a zebra!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Roooar!");
    }
}
