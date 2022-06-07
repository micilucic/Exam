package U4;

public class Dog extends Animal {

    public Dog (String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Happily jumping around");
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof woof!");
    }
}
