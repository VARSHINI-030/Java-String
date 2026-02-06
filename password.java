
import java.util.Scanner;

public class password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() < 12) {
            System.out.println("Password must be at least 12 characters long.");
            return;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }
        if (hasUpper && hasDigit && hasSpecial) {
            System.out.println("Password is VALID");
        } else {
            System.out.println("Password is INVALID");

            if (!hasUpper) {
                System.out.println("- Must contain at least one uppercase letter");
            }
            if (!hasDigit) {
                System.out.println("- Must contain at least one number");
            }
            if (!hasSpecial) {
                System.out.println("- Must contain at least one special character");
            }
        }
    }
}
