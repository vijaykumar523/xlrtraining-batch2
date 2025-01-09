import java.util.Scanner;
public class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;
        long totalDays = minutes / (minutesInHour * hoursInDay);
        long years = totalDays / daysInYear;
        long remainingDays = totalDays % daysInYear;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");

        scanner.close();
    }
}