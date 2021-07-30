package enumException.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Login {
    String login;
    private static final String LOGIN_PATTERN = "[a-zA-Z_0-9]";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login1 = (Login) o;
        return Objects.equals(login, login1.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }

    public static String EnterLogin () throws LoginFormatException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String login = null;
        try {
            login = reader.readLine();
            if (login.length() > 20) {
                System.out.println("Login should contain less than 20 characters");
            }
            if (!login.matches(LOGIN_PATTERN)) {
                System.out.println("Login should contain letter,numbers and symbol '_' only");
            }
        } catch (IOException e) {
            throw new LoginFormatException("Enter valid login");
        }
    return login;

    }
}
