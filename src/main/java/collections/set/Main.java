package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Pet> newSet = new HashSet<>();
        newSet.add(new Cat("cat1"));
        newSet.add(new Cat("cat2"));
        newSet.add(new Cat("cat3"));
        newSet.add(new Dog("dog1"));
        newSet.add(new Dog("dog2"));
        newSet.add(new Dog("dog3"));
        System.out.println(newSet);








    }
}
