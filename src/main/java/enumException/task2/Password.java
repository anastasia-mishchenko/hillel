package enumException.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {
    private static final String PASSWORD_PATTERN = "[a-zA-Z_0-9]";
    String EnterPassword;

    public static String EnterPassword () throws PasswordFormatException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = null;
        try {
            password = reader.readLine();
            if (password.length() > 20) {
                System.out.println("Password should contain less than 20 characters");
            }
            if (!password.matches(PASSWORD_PATTERN)) {
                System.out.println("Password should contain letter,numbers and symbol '_' only");
                // тут я пробовала вызывать это в мейне и у меня постоянно выводит это, значит что-то не так с условием
            }
        } catch (IOException e) {

            throw new PasswordFormatException("Enter valid password");
        }
    return password;



    }
}
