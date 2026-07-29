public class plusone {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            // If digit is less than 9, just increase it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry to the left
         
            digits[i] = 0;
         
       }
      
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

}
