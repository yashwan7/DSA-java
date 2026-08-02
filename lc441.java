public class lc441 {
class Solution {
    public int arrangeCoins(int n) {
      long start = 0 ; 
    long end = n ;
    while(start<=end ){
        long  mid = start + (end-start)/2 ;
        if(mid*(mid+1)/2<n){
            start = mid +1 ;
              } 
        else if(mid*(mid+1)/2 > n ){
            end = mid-1 ;}
            else {return (int) mid ;
                }
        
                
            }
        
       return (int) end;  // n = 8 case  dry run start = 4 and end = 3 , so 4 means n=10 is needed . so could not satisfy return end 
    }
}
}
