package abstractInterfaces;

public class Main {
    public static void main(String[] args) {
        Swallow swallow1 = new Swallow();
        double speed = swallow1.speed();
        System.out.println(speed);

        Swan swan = new Swan();
        System.out.println(swan.speed(swan));

    }
}
