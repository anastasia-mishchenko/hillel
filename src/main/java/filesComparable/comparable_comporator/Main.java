package filesComparable.comparable_comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(100,16000,"Kyiv",true);
        House house2 = new House(700,13000,"Odesa",false);
        House house3 = new House(300,20000,"Lviv",true);

        List<House> arraylist = new ArrayList<>();
        arraylist.add(house1);
        arraylist.add(house2);
        arraylist.add(house3);


        System.out.println("Sorted by price:");
        Collections.sort(arraylist);
        for (House item:arraylist) {
            System.out.println(item);
        }

        System.out.println("Sorted by area:");
        Collections.sort(arraylist,new AreaComparator());
        for (House item:arraylist) {
            System.out.println(item);
        }


        }

    }

