package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Cat cat3 = new Cat("Cat3");
        Cat cat4 = new Cat("Cat4");
        Cat cat5 = new Cat("Cat5");

        Map <String,Cat> newMap = new HashMap<>();
        newMap.put(cat1.getName(), cat1);
        newMap.put(cat2.getName(), cat2);
        newMap.put(cat3.getName(), cat3);
        newMap.put(cat4.getName(), cat4);
        newMap.put(cat5.getName(), cat5);
        System.out.println(newMap);




    }
    }

