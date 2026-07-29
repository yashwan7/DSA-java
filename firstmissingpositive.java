public class firstmissingpositive {

    public int firstMissingPositive(int[] nums) {
       
        int i= 0;
        while(i<nums.length){
            int correct = nums[i] -1 ;  
            if(nums[i] > 0 && nums[i]<=nums.length && nums[i]!=nums[correct] ) // nums[i] < nums.length is for " The number n doesn't have an index in the array." contion . and nums[i ] > 0 is for ignoring the negative numbers .
                { swap(nums,i,correct);
                } else 
                {
                    i++;
                } 
            }
        // search for first missing number 
        for (int j = 0 ; j< nums.length ; j ++)
        {   if ( nums[j]!= j+1)     
               return j+1;
        } return nums.length +1  ; // if all indices have the correct values,
        
    }        
        void swap(int [] nums,int first , int second) 
    { int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp ;
    }
}

 

