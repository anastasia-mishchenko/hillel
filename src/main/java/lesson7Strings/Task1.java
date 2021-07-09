package lesson7Strings;

public class Task1 {
    public static void main(String[] args) {
    mark("Иванов", '5',"биологии");
    }

    public static void mark (String student, char mark, String subject) {

        String result = String.format("Студент %s получил %c по %s",student,mark,subject);
        System.out.println(result);

    }
}
