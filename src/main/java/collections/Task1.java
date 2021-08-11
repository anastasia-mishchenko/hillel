package collections;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList();

        list.add("lira");
        list.add("roza");
        list.add("loza");

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).contains ("r") && list.get(i).contains("l")){
                continue;
            } else  if (list.get(i).contains("r") && ! list.get(i).contains("l"))   {
                list.remove(list.get(i));
                i--;
            }else if (list.get(i).contains("l") && ! list.get(i).contains("r")){
                list.add(list.get(i));
                i++;
            }
            System.out.println(list.get(i));
        }
//        for (String item: list) {
//            System.out.println(item);
            
        }

        }





