public class lc3110 {
class Solution {
    public int scoreOfString(String s) {
     char[] ch = s.toCharArray();
       int count = 0;
        for (int i = 1; i < ch.length; i++) {
            count += Math.abs(ch[i] - ch[i - 1]);
        }
        return count; }
}
}
