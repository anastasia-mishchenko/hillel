package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        //найти строки которые начинаються на а, перевести их в верхний регистр и вывести
        List <String> stringList = Arrays.asList("asdf","rkfoe","aorigt","ghu","ieuth");
        stringList.stream().filter((String item) -> (item.charAt(0) == 'a')).map(String::toUpperCase).forEach(x-> System.out.println(x));


//        подскажите что не так? Я сперва хотела сохранить слова которые начинаються на а в новый лист
//        с помощью collect(Collectors.toList());
//        и по нему пройтись и перевести в верхний регистр, но не сработало.
//       for (int i = 0; i < newList.size(); i++) {
//            newList.get(i).toUpperCase();
//            System.out.println(newList.get(i));
//
//        }
    }
}
