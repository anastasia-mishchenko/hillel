package Arrays;

import java.io.*;

public class Task3 {
        public static void main(String[] args) throws IOException {

            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            System.out.println("Веедите длинну масива");
            int size = Integer.parseInt(bufferedReader.readLine());
            int [] mas = new int [size];
            System.out.println("Введите " + size + " чисел");
            for (int i = 0; i < size; i++) {

                int a = Integer.parseInt(bufferedReader.readLine());
                mas[i] = a;
            }
            for (int j=0; j<mas.length - 1; j++){
                if(mas[j] < mas[j+1]){
                    int s = mas [j];
                    mas [j] = mas [j+1];
                    mas [j+1] = s;
                }

            }
            System.out.println("Min number is " + mas[mas.length -1]);
    }
}
