package lesson7Strings;

public class Task3 {
    public static void main(String[] args) {
        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";

        String [] array1 = s1.split(" ");
        if (s1.contains("plus")){
            int a = Integer.valueOf(array1[0]);
            int b = Integer.valueOf(array1[2]);
            int res = a+b;
                System.out.println(res);
        }
        String [] array2 = s2.split(" ");
        if (s2.contains("minus")){
            int a = Integer.valueOf(array2[0]);
            int b = Integer.valueOf(array2[2]);
            int res = a-b;
            System.out.println(res);
        }
        String [] array3 = s3.split(" ");
        if (s3.contains("plus")){
            int a = Integer.valueOf(array3[0]);
            int b = Integer.valueOf(array3[2]);
            int res = a+b;
            System.out.println(res);
        }
        String [] array4 = s4.split(" ");
        if (s4.contains("minus")){
            int a = Integer.valueOf(array4[0]);
            int b = Integer.valueOf(array4[2]);
            int res = a-b;
            System.out.println(res);
        }


        }

    }

