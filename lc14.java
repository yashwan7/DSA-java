public class lc14 {
//class Solution {
  //  public String longestCommonPrefix(String[] strs) {
  //      if (strs == null || strs.length == 0) 
  //          return "";
  ///           for (int i = 0; i < strs[0].length(); i++) {
  //          char c = strs[0].charAt(i);
  ///            for (int j = 1; j < strs.length; j++) {
  //                  return strs[0].substring(0, i);}}}
  //                  return strs[0];
  //                  
  //  }
// }
//class Solution {
  //  public String longestCommonPrefix(String[] strs) {
  //      String prefix = "";
  //      for (int i = 0; i < strs[0].length(); i++) {
  //          char ch = strs[0].charAt(i);
  //          for (String str : strs) {
  //              if (i >= str.length() || str.charAt(i) != ch) {
  //                  return prefix;
  //              }
  //          }
  //          prefix += ch;
  //      }
  //      return prefix; }
//}
class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != ch) {
                    return prefix.toString();
                }
            }

            prefix.append(ch);
        }

        return prefix.toString();
    }
}
}
