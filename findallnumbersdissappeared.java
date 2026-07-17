public class findallnumbersdissappeared {

    public List<Integer> findDisappearedNumbers(int[] nums) {
         int i= 0;
        while(i<nums.length){
            int correct = nums[i]-1;  // nums[i]-1  needed kyunki starting 1 se hai not from 0 .
            if( nums[i]!=nums[correct] ) 
                { swap(nums,i,correct);
                } else 
                {
                    i++;
                } 
            } // for returning an array which contains missing elements 
           List<Integer> ans = new ArrayList<>();
              for (int j = 0 ; j< nums.length ; j ++)
        {   if ( nums[j]!= j+1)      // numbers are from 1 to n so j+1 
              ans.add(j+1);     // j is index and j+1 is the value cozz 1 to n is the range , 
        } return ans ;
            
    }  void swap(int [] nums,int first , int second) 
    { int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp ;
    }
}

