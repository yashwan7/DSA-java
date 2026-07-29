public class smallestpaliindromerearrangent {

    public String smallestPalindrome(String s) {
       int[] freq = new int[26];
    String one;
    String last;
    
       // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
       StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();
          // Build left half and middle
        for (int i = 0; i < 26; i++) {
             for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            } if (freq[i] % 2 == 1) {
                middle.append((char) ('a' + i));
            }}
          

           return left.toString() + middle.toString() + left.reverse().toString();
    }}

