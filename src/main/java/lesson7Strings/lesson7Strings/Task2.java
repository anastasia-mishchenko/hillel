package lesson7Strings;

import java.io.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Веедите слово с четным кол-вом букв");
        String word = String.valueOf(bufferedReader.readLine());
        System.out.println("Веедите еще одно слово с четным кол-вом букв");
        String word2 = String.valueOf(bufferedReader.readLine());

        int l1 = word.length();
        int l2 = word2.length();

        if (l1%2 == 0 && l2%2 == 0) {
            int half = l1 / 2;
            int half2 = l2 / 2;
            String result = (word.substring(0,half))+(word2.substring(half2,l2));
            System.out.println(result);

        } else System.out.println("Вы ввели нечетные числа!");

        }

        
    }

