package enumException.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            checkLoginPassword("rtrt55rt", "55555", "55555");
        } catch (LoginFormatException e) {
            e.printStackTrace();
        } catch (PasswordFormatException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkLoginPassword(String login, String password, String confirmPassword) throws LoginFormatException, PasswordFormatException {
        final String PATTERN = "[a-zA-Z_0-9]";


        if (login.length() > 20) {
            System.out.println("Login should contain less than 20 characters");
        }
        if (!login.matches(PATTERN)) {
            System.out.println("Login should contain letter,numbers and symbol '_' only");
        }
        if (password.length() > 20) {
            System.out.println("Password should contain less than 20 characters");
        }
        if (!password.matches(PATTERN)) {
            System.out.println("Password should contain letter,numbers and symbol '_' only");
        }
        if (!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }
    return true;

    }
}

