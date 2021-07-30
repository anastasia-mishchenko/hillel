package enumException.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ConfirmPassword {
    private static final String PASSWORD_PATTERN = "[a-zA-Z_0-9]";
    String confirmPassword;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfirmPassword that = (ConfirmPassword) o;
        return Objects.equals(confirmPassword, that.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confirmPassword);
    }

    public static String ConfirmPassword() throws PasswordFormatException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String confirmPassword = null;
        try {
            confirmPassword = reader.readLine();
            if (confirmPassword.length() > 20) {
                System.out.println("Password should contain less than 20 characters");
            }
            if (!confirmPassword.matches(PASSWORD_PATTERN)) {
                System.out.println("Password should contain letter,numbers and symbol '_' only");
            }
        } catch (IOException e) {

            throw new PasswordFormatException("Enter valid password");
        }
        return confirmPassword;

    }
}
