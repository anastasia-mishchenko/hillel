package Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //int[] array = {2, 4, 7, 5, 8, 5};
/*
        a)
        double average = 0.0;
        if (array.length > 0){

            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum / array.length;
            System.out.println("Среднее арифметическое: " + average );
        }
*/
/*
        b)

        if (array.length > 0){

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Сумма всех элементов: " + sum );
        }
*/
        //c)
        int array[] = {1, 2, 6, -4, 4, 5, -2, -5, 2, 3};
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }System.out.println(max);
        int min = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];

            }

        }System.out.println(min);
        for (int i = 0; i < array.length; i++);
    }
}
