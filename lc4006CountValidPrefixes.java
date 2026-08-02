public class lc4006CountValidPrefixes {
class Solution {
    public int countValidPrefixes(String s) {
       int o = 0 ;
        int one = 0 ;
        int ans =0 ;
        for (char ch : s.toCharArray()){
            if(ch=='0'){
                o++;
            } else{ one++;
                  }
            if(Math.abs(o-one)<=1){
                ans++ ;
            }
        }
        return ans ;
    }
}
}
