package abstractInterfaces;

public class Swallow extends Birds implements CanFly, CanEat {



    @Override
    public void eatBugs() {
        System.out.println("I eat bugs");
    }

    @Override
    public double speed(CanFly fly) {
        return fly.speed()/5;
    }

    @Override
    public double speed() {
        return 5.5;

    }
}
