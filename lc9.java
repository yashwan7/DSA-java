public class lc9 {
class Solution {
    public boolean isPalindrome(int x) {
       int num=x;
       int rem;
       int rev=0;
       boolean res;
       while (num>0)
       {
           rem=num%10;
           num=num/10;
           rev=(rev*10)+rem;
       }
       if(rev==x)
       {
           res=true;
       }
       else
       {
           res=false;
       }
    return res;}
}
// class Solution {
  //  public boolean isPalindrome(int x) {
//
    //    if (x < 0)
    //        return false;
//
    //    String s = String.valueOf(x);
    //    char[] ch = s.toCharArray();
//
    //    int left = 0;
    //    int right = s.length() - 1;
///
    //    while (left < right) {
//
    //        if (ch[left] != ch[right]) {
    //            return false;
    //        }
//
    ///        left++;
    //        right--;
    //    }
//
    //    return true;
   // }
//}
}
