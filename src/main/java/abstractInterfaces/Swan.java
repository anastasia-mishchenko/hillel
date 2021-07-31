package abstractInterfaces;

public class Swan extends Birds implements CanSwim,CanFly{

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void canSwim() {
        System.out.println("I can swim");
    }

    @Override
    public double speed(CanFly fly) {
        return fly.speed()/3;
    }

    @Override
    public double speed() {

        return 3.3;
    }
}
