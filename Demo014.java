public class Demo014 {
    public static void main(String[] args) {
        int number = 5;
        int positive = +number;
        int negative = -number;
        int incremented = ++number;
        int decremented = --number;
        int postIncremented = number++;
        int postDecremented = number--;
        boolean flag = true;
        boolean complement = !flag;
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Pre-increment: " + incremented);
        System.out.println("Pre-decrement: " + decremented);
        System.out.println("Post-increment: " + postIncremented);
        System.out.println("Post-decrement: " + postDecremented);
        System.out.println("Logical complement: " + complement);
    }
}