package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {
        List <User> newList = Arrays.asList(
                new User("Jack", 10),
                new User("Ana", 15),
                new User("Arthur", 28)
        );

        Optional<User> firstUser = newList.stream().filter(x -> x.getName().startsWith("A")).findFirst();
        System.out.println(firstUser.get());

    }
}
