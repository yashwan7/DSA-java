
class GuessGame {
    int pick = 7;
    public int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }
}

public class GuessNumber extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start<=end){
            int mid = start+(end - start)/2 ;
            int result = guess(mid);
            if (result == 0)
            { return mid ;}
            else if (result == 1)
            {start = mid +1 ;
            }
            else if ( result == -1 )
            { end = mid -1 ;

            }
        } return -1 ;
    }
    public static void main(String[] args) {
        GuessNumber obj = new GuessNumber();
        int ans = obj.guessNumber(10);
        System.out.println(ans);
    }
    }