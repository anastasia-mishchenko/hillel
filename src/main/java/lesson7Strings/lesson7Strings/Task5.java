package lesson7Strings;

public class Task5 {
    public static void main(String[] args) {
        String phrase = "It's a possibility to having a dream come true that makes life interesting";
//        a)
//        String s1 = s.toUpperCase();
//        System.out.println(s1);
        //b)
//        String s2 = s.toLowerCase();
//        System.out.println(s2);
        //c)
        String [] array = phrase.split(" ");
        for (int i = 0; i < array.length; i++) {

            array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1).toLowerCase();
        }

        String phrase1 = String.join(" ",array);
        System.out.println(phrase1);
            
        }
        
    }



