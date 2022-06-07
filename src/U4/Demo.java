package U4;

public class Demo {
    Frog quaxi = new Frog("green", 2);
    Animal quaxiAsAnimal = quaxi;
    Frog sameQuaxi = (Frog) quaxiAsAnimal;
}
