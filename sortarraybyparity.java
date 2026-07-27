public class sortarraybyparity {

    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                ans[left] = nums[i];
                left++;
            } else {
                ans[right] = nums[i];
                right--; }
        }
        return ans;   }
}

