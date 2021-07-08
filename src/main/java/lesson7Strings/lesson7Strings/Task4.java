package lesson7Strings;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String[] massive = new String[10];
        for (int i = 0; i < massive.length; i++) {
            System.out.println("Веедите строку");
            massive[i] = String.valueOf(bufferedReader.readLine());
        }
        int size = 0;

        for (String item : massive) {
            size += item.length();
        }
        int avg = size/ massive.length;

        for (int i = 0; i < 10; i++) {
            if (massive[i].length() < avg) {
                System.out.println(massive[i]);

            }


        }
    }
}