package lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sweets Candy = new Candy( 2);
        Sweets Cake = new Sweets( 3 );
        Sweets IceCream = new Sweets( 1);
        Sweets frf = new Sweets(5);

        System.out.println(Cake.getWeight() + Candy.getWeight() + IceCream.getWeight());

        Sweets [] array = new Sweets[Sweets.count] ;

        System.out.println(Arrays.toString(array));
    }
}
