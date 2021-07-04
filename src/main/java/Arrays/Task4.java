package Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = {2, 4, 7, 5, 8, 1};
        //a)
//        int n = 0;
//        for (int i = 0; i < mas.length - 1 ; i++) {
//
//            for (int j = 0; j < mas.length - 1 - n; j++) {
//                if (mas[j] < mas[j + 1]) {
//                    int s = mas[j];
//                    mas[j] = mas[j + 1];
//                    mas[j + 1] = s;
//
//            }
//        }
//            n++;
//        } System.out.println(Arrays.toString(mas));
        //b)
//        int n = 0;
//        for (int a : mas) {
//            for (int j = 0; j < mas.length - 1 - n; j++) {
//                if (mas[j] < mas[j + 1]) {
//                    int s = mas[j];
//                    mas[j] = mas[j + 1];
//                    mas[j + 1] = s;
//                }
//            }
//            n++;
//        }
//        System.out.println(Arrays.toString(mas));
        //c)
        Arrays.sort(mas);
        String result = Arrays.toString(mas);
        int res [] = new int [6];
        for (int i = mas.length - 1, j=0; i >= 0 ; i--, j++) {

            res [j] = mas [i];
        }
        System.out.println(Arrays.toString(res));
    }
}

