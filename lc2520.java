public class lc2520 {
class Solution {
    public int countDigits(int num) {
        int original = num;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (original % digit == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
//while (num > 0) {
  //  int digit = num % 10; // Get last digit
    // Process the digit
  //  num /= 10;            // Remove last digit
//}
}
