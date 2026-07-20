class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
     int left = 0 ;
        int right = s.length() - 1  ;
   while(left<right ) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else {
                char start = s.charAt(left);
                char end = s.charAt(right);

                if (start != end) {
                    return false;
                }
                left++;
                right--;
            } }

        return true; }
}

