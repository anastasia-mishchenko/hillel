package classObjectLesson;

import java.util.Arrays;

//1)
public class Person {
    String name;
    int age;
    boolean isMarried;

    //2) Constructors
        public Person (){
            name = "Ivan";
            age = 30;
            isMarried = false;
        }
        public Person (String name){
            this.name = name;

        }
        public Person (String name, int age){
            this.name = name;
            this.age = age;
        }
        public Person (String name, int age, boolean isMarried){
            this.name = name;
            this.age = age;
            this.isMarried = isMarried;

        }
        //3)
        @Override
        public String toString (){
            return String.format("My name is %s. I'm %d years old. Am I married? %b",name,age,isMarried);
        }

        //4)
        @Override
        public boolean equals (Object person2){
            if (this == person2) return true;
            if (person2 == null || this.getClass() != person2.getClass()) return false;
            Person person = (Person) person2;
            return true;
        }
        @Override
        public int hashCode() {    // вопрос 1: если в примере было понятно что надо сравнивать по ДНК и ДНК там интовове, то в нашем случае что должен возвращать этот метод? Какое значение int?
            return age;
        }

//        9)
//        public int anniversary (int age) {
    // вопрос 2: я зависла как мне в этом методе пройтись по всем обьектам

//            int num = 0;
//            for (int i = 0; i < 100; i= i+10) {
////              if (age = i || (age > i && age <= (i*2-1))){
//            }
//           if (age == 10 || (age > 10 && age <= 19)) {
//                return 1;
//                if (age == 20 || (age > 20 && age <= 29)) {
//                    return 2;
//                    if (age == 30 || (age > 30 && age <= 39)) {
//                        return 3;
//                    }
    //public String firstLetterName (String name){
            // тут тоже самое как пройти по обьектам?
//    }






        public static void main(String[] args) {
            //5)
            Person person1 = new Person();
            Person person2 = new Person("Vika");
            Person person3 = new Person("Anastasia",28);
            Person person4 = new Person("Arthur",29,false);

            System.out.println(person2.toString());

            //6)
            person4.age = person1.getAge();
            //person4.age = 20; ??

            //8)
            Person mas [] = {person1,person2,person3,person4};
            System.out.println(Arrays.toString(mas));

            //7)
            for (Person item:mas) {
                String name = item.getName();
                int age = item.getAge();
                boolean isMarried = item.isMarried();
                System.out.print("Age" +" "+ age);
                System.out.print("Name" +" " +name);
                System.out.print("Married?"+" " + isMarried);
            } // понимаю что не так, но уже не соображаю как)




        }






        //10)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }






}
