package U4;

public class Frog extends Animal{

    public Frog (String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Jumping around!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Skkrrk!");
    }

}
