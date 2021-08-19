package streamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List <Integer> integerList = Arrays.asList(1,3,67,8,90,324,67,32,89);
        long count = integerList.stream().filter(i -> i%2==0).count();
        System.out.println(count);

    }
}
