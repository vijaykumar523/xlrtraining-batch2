import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        String correctUsername = "user003";
        String correctPassword = "user_003";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();
        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("wishing you a very happy new year");
        } else {
            System.out.println("Incorrect username or password.");
        }
        scanner.close();
    }
}
