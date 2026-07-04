import java.util.Arrays;
public class twoSum { public int[] twoSum(int[] numbers, int target) {
    int a , b ;
    for(int i=0 ; i<numbers.length; i++)
    { a=numbers[i];
        b = target - a;
        int start = i+1;
        int  end = numbers.length-1;
        while(start<=end)

        { int mid = start + (end - start)/2;
            if ( b < numbers[mid])
                end = mid -1 ;
            else if (b > numbers[mid])
                start = mid+1;
            else return  new int[]{i +1, mid + 1};
        }


    } return new int[]{-1, -1}; }  public static void main(String[] args) {

   twoSum obj = new twoSum();

    int[] numbers = {2, 7, 11, 15};
    int target = 9;

    int[] result = obj.twoSum(numbers, target);

    System.out.println(Arrays.toString(result));
}
}
