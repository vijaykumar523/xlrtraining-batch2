import java.util.Scanner;

public class Demo015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;
        int length = cleanInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}