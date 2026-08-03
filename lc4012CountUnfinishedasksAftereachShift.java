import java.util.Arrays;

public class lc4012CountUnfinishedasksAftereachShift {
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
       int n = tasks.length ;
        int m = shifts.length ;
        long [] pref = new  long [n +1];
        for(int i = 0 ; i < n ; i ++){
            pref[i+1]= pref[i]+tasks[i];
            
        }
        long totaltime = pref[n ] ;
        long curprog = 0 ;
        int [] ans = new int [m] ;
        for (int j = 0 ;j < m ; j ++){
            curprog += shifts[j];
            if(curprog >= totaltime ){
                ans[j] =0 ;
                curprog = 0 ;
            } else {
                int idx = Arrays.binarySearch(pref, curprog);
                if(idx < 0){
                    idx = -idx -2 ;
                }
                ans[j] = n - idx ;
            }
        }
         return ans ;
    }
}
}
