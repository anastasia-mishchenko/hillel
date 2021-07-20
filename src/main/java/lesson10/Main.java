package lesson10;

public class Main {
    public static void main(String[] args) {
        Candy Candy1 = new Candy( 1);
        Sweets Cake = new Sweets( 2 );
        Sweets IceCream = new Sweets( 1);

        System.out.println(Cake.getWeight() + Candy1.getWeight() + IceCream.getWeight());
    }
}
