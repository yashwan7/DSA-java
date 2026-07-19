public class lc645setmismatch {

    public int[] findErrorNums(int[] nums) {
         
         int i= 0;
       while (i < nums.length) {
          
                int correct = nums[i] - 1; // Calculate where this number actually belongs      
                // If the target spot doesn't already have this number, swap them
                if (nums[i] != nums[correct]) { 
                    swap(nums, i, correct);
                } 
           
            else { 
                i++;
            } 
        } 
          
              for (int j = 0 ; j< nums.length ; j ++)
        {   if ( nums[j]!= j+1)     
             
         return new int[]{nums[j], j + 1};;
        }
        return new int []{-1,-1};
        
       
    } 
    
     void swap(int [] nums,int first , int second) 
    { int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp ; 
    }   
    

}



