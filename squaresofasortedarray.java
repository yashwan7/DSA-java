public class squaresofasortedarray {

 public int[] sortedSquares(int[] nums) {
int left = 0 ;
int right = nums.length-1;
int k = nums.length-1;
int[] ans = new int[nums.length];
while(left <= right)
{
    if ( Math.abs(nums[left]) > Math.abs(nums[right])) 
       { ans[k] = nums[left] * nums[left];
        left++;}
    else {
        ans[k] = nums[right] * nums[right] ;
        right-- ;
 }
    k-- ;
}
return ans ; }}


  //  public int[] sortedSquares(int[] nums) {
//int[] num = new int[nums.length];
//        for (int i = 0 ; i < nums.length ; i++){
//            num[i] = nums[i]*nums[i] ;
//        }
//      Arrays.sort(num) ;
//    return num ;
    



