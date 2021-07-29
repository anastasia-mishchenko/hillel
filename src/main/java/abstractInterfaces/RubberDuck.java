package abstractInterfaces;

public class RubberDuck extends Birds implements CanSwim{
    boolean isRubber;

    @Override
    public void canSwim() {
        System.out.println("I can swim");

    }
}
