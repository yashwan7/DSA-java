public class findduplicateinarray {

    public int findDuplicate(int[] nums) {
         int i= 0;
       while (i < nums.length) {
            // If the number is not at its correct index (e.g , value 1 should be at index 0)
            if (nums[i] != i + 1) {   
                int correct = nums[i] - 1; // Calculate where this number actually belongs      
                // If the target spot doesn't already have this number, swap them
                if (nums[i] != nums[correct]) { 
                    swap(nums, i, correct);
                } 
                // If the target spot ALREADY has this number, we found the duplicate!
                else { 
                    return nums[i]; 
                }
            } 
            // If the number is already sitting at its correct index, move to the next one
            else { 
                i++;
            } 
        } 
        return -1; 
    } // for returning number which is repeated. 
          
       // q has special case which says dont modify array nums so cantt use this even though its logically correct.      
      //      for (int i = 0 ; i < nums.length; i++){
      //      if ( nums[i] != i + 1)
     //       {return nums[i];
           
     void swap(int [] nums,int first , int second) 
    { int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp ;
    }   
    
}

