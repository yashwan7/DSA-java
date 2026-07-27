
public class containsduplicate {

    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
  // public boolean containsDuplicate(int[] nums) {
    //Arrays.sort(nums);
    //for(int i = 0 ; i < nums.length- 1; i ++){
    //    if (nums[i]==nums[i+1]){
    //        return true ;
    //    }
    //} 
    //return false ;
    
