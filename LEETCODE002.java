public class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123)); 
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120)); 
    }
}