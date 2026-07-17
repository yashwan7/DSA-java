public class missingnumber {

    public int missingNumber(int[] nums) {
        int i= 0;
        while(i<nums.length){
            int correct = nums[i];  // nums[i]-1 not needed kyunki starting 0 se hai not from 1 .
            if(nums[i] < nums.length && nums[i]!=nums[correct] ) // nums[i] < nums.length is for " The number n doesn't have an index in the array." contion .
                { swap(nums,i,correct);
                } else 
                {
                    i++;
                } 
            }
        // search for first missing number 
        for (int j = 0 ; j< nums.length ; j ++)
        {   if ( nums[j]!= j)     
               return j;
        } return nums.length ; // if all indices have the correct values, the missing number is nums.length.
    }        
        void swap(int [] nums,int first , int second) 
    { int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp ;
    }
}

