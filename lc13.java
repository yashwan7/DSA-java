public class lc13 {
class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
            int[] val = new int[128];
        val['I'] = 1;
        val['V'] = 5;
        val['X'] = 10;
        val['L'] = 50;
        val['C'] = 100;
        val['D'] = 500;
        val['M'] = 1000;
        int nxt = 0 ;
        int total = 0 ;
        for(int i = 0 ; i < s.length() ; i ++){
           int  cur = val[ch[i]];
    //  compare left with right and total ko  i ko add   if left is big or esle i ko sub      
            if (i < s.length() - 1) {
    nxt = val[ch[i + 1]];
}
            if (cur < nxt ) total -= cur ;
            else total += cur ;
            
        }
        return total ;
        
    } 
}
}
