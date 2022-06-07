package U4;

public abstract class Animal {
    protected String color;
    protected int countEyes;

    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

    public abstract void walk();

    public abstract void makeNoise();
}
