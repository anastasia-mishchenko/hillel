package collections;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList();

        list.add("lira");
        list.add("roza");
        list.add("loza");

          for (String item:list) {          //почему тут падает ексепшн?
            if (item.contains("р") && item.contains("л"))
            {
                continue;
            }else  if (item.contains("r")) {
                list.remove(item);
            }else if (item.contains("l")){
                list.add(item);
            }
            System.out.println(item);
        }


        }



    }

