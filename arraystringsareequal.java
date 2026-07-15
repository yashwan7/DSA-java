public class arraystringsareequal {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
String s2 = "";
        for(int i = 0; i<=word1.length-1;i++) {
          s1 = s1.concat(word1[i]); }
        for (int i = 0; i < word2.length; i++) {
          s2 = s2.concat(word2[i]);}
        
         return s1.equals(s2);
    }
}

