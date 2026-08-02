public class minimumInitialStrengthtoDefeatAllMonsters {
class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int [] m = monsters;
        int [][] b = boosts;
        int [] ans = m ;
        int n = m.length ;
        long [] d = new long[n+1];
        for (int[] v : b ){
            d[v[0]]+= v[2];
            d[v[1] + 1] -= v[2];
        }
         long[] B = new long[n];
        long cb = 0, sm = 0;
         for (int i = 0 ; i < n ; i++){
             cb+= d[i];
             B[i] =cb;
             sm += m[i];
           }
        long l = 0, h = sm, a = h;
        while (l <= h) { 
            long mid = l +(h-l)/2 ;
            if(ok(m,B, mid)){
                a= mid ;
                h = mid -1 ;
                
            } else {
                l = mid + 1 ;
                
            } 
        }
        return a ;
    }
    private boolean ok(int[] m , long [] B , long s){    long c = s;
        for (int i = 0; i < m.length; i++) {
            if (c + B[i] < m[i]) return false;
        c-= m[i];
            if(c< 0 ) c=0;
            
        }                                                      return true ;}
}
}
