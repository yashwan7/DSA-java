public class lc486 {

class Solution {

    Integer[][] dp;

    public boolean predictTheWinner(int[] nums) {

        int n = nums.length;
        dp = new Integer[n][n];

        return solve(nums, 0, n - 1) >= 0;
    }

    private int solve(int[] nums, int i, int j) {

        if (i == j) {
            return nums[i];
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int takeLeft = nums[i] - solve(nums, i + 1, j);
        int takeRight = nums[j] - solve(nums, i, j - 1);

        return dp[i][j] = Math.max(takeLeft, takeRight);
    }
}

//class Solution {
  //  public boolean predictTheWinner(int[] nums) {
  //      return solve(nums, 0, nums.length - 1, 0, 0, 0);
  //  }
//
  //  boolean solve(int[] nums, int i, int j, int turn, int score1, int score2) {
//
  //      if (i > j) {
  //          return score1 >= score2;
  //      }
  //      if (turn == 0) { // Player 1's turn
///
  //          boolean takeLeft = solve(nums, i + 1, j, 1,
  //                                   score1 + nums[i], score2);
//
  //          boolean takeRight = solve(nums, i, j - 1, 1,
  //                                    score1 + nums[j], score2);
//
  //          return takeLeft || takeRight;
  //      } else { // Player 2's turn
//
  //          boolean takeLeft = solve(nums, i + 1, j, 0,
  //                                  score1, score2 + nums[i]);
//
  ///          boolean takeRight = solve(nums, i, j - 1, 0,
  //                                    score1, score2 + nums[j]);
//
  //          return takeLeft && takeRight;
  //      }
  //  } }
  
}
