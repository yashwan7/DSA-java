public class lc7reverseinteger {
/*
class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }
        ArrayList<Integer> digits = new ArrayList<>();
        while (x != 0) {
            digits.add(x % 10);
            x /= 10;
        }
        int ans = 0;
        for (int digit : digits) {
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            ans = ans * 10 + digit;
        }
        return negative ? -ans : ans;
    }
}
*/
class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int digit = x % 10;
            x /= 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            // Underflow check
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }
}
}
