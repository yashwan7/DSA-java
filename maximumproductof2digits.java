public class maximumproductof2digits {

    public int maxProduct(int n) {
 
int first = -1;
int second = -1;

while (n > 0) {
    int digit = n % 10;
    n /= 10;

    if (digit >= first) {
        second = first;
        first = digit;
    } else if (digit > second) {
        second = digit;
    }
}

return first * second; } }

//class Solution {
   // public int maxProduct(int n) {
 
//List<Integer> digits = new ArrayList<>();
// int ans = 0;
//int second = 0 ;
// while (n > 0) {
//    digits.add(n % 10);
   // n /= 10;
//}

// for (int i = 0; i < digits.size(); i++ ){
 //   ans = Math.max(ans, digits.get(i) );
//}
//digits.remove(Integer.valueOf(ans));

//for (int j = 0; j < digits.size(); j++ ){
 // second = Math.max(second, digits.get(j) ); 
//}


//return ans * second;
//}}

