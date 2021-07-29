package abstractInterfaces;

public class Duckbill extends Mammals implements CanSwim{
    boolean hasBeak;

    @Override
    public void canSwim() {
        System.out.println("I can swim");

    }
}
