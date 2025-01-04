import java.util.Scanner;
public class Demo1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String storedUsername = "student";
        String storedPassword = "password123";
        System.out.println("Welcome to Mallareddy University!");
        System.out.print("Have you registered before? (yes/no): ");
        String registrationStatus = scanner.nextLine();
        if (registrationStatus.equalsIgnoreCase("no")) {
            System.out.println("Please create your account.");
            System.out.print("Enter a username: ");
            String newUsername = scanner.nextLine();
            System.out.print("Enter a password: ");
            String newPassword = scanner.nextLine();
            System.out.println("Account created successfully!");
            String loginUsername;
            String loginPassword;
            boolean loggedIn = false;
            do {
                System.out.println("Please log in now.");
                System.out.print("Enter your username: ");
                loginUsername = scanner.nextLine();
                System.out.print("Enter your password: ");
                loginPassword = scanner.nextLine();
                if (loginUsername.equals(newUsername) && loginPassword.equals(newPassword)) {
                    System.out.println("Login successful!");
                    System.out.println("Welcome to Mallareddy University!");
                    loggedIn = true;
                } else {
                    System.out.println("Invalid credentials! Please try again.");
                }
            } while (!loggedIn);
        } else if (registrationStatus.equalsIgnoreCase("yes")) {
            System.out.println("Please log in with your credentials.");
            String loginUsername;
            String loginPassword;
            boolean loggedIn = false;
            do {
                System.out.print("Enter your username: ");
                loginUsername = scanner.nextLine();
                System.out.print("Enter your password: ");
                loginPassword = scanner.nextLine();
                if (loginUsername.equals(storedUsername) && loginPassword.equals(storedPassword)) {
                    System.out.println("Login successful!");
                    System.out.println("Welcome to Mallareddy University!");
                    loggedIn = true;
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            } while (!loggedIn);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
        scanner.close();
    }
}
