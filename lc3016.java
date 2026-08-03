public class lc3016 {
class Solution {
    public int minimumPushes(String word) {
      int[] freq = new int[26];

    for (char ch : word.toCharArray()) {
    freq[ch - 'a']++;
}  // Selection Sort (Ascending) 0(n) // Arrays.sort(freq); complexity 0logn , 
for (int i = 0; i < 26 - 1; i++) {

    int minIndex = i;

    for (int j = i + 1; j < 26; j++) {
        if (freq[j] < freq[minIndex]) {
            minIndex = j;
        }
    }

    int temp = freq[i];
    freq[i] = freq[minIndex];
    freq[minIndex] = temp;
}
    int ans = 0;
    int push = 1;
     int count = 0;
  for (int i = 25; i >= 0; i--) {

    if (freq[i] == 0)
        break;

    ans += freq[i] * push;

    count++;
// After assigning 8 letters, increase push count
    if (count == 8) {
        push++;
        count = 0;  }
} return ans ; }} 
}
