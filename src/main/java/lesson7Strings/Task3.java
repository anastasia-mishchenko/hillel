package lesson7Strings;

public class Task3 {
    public static void main(String[] args) {
        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";

        String [] array = s1.split(" ");
        if (s1.contains("plus")){
            int a = Integer.valueOf(array[0]);
            int b = Integer.valueOf(array[2]);
            int res = a+b;
                System.out.println(res);
        }
        if (s1)
        char[] array1 = s2.toCharArray();
        char[] array2 = s3.toCharArray();
        char[] array3 = s4.toCharArray();


        }

    }

