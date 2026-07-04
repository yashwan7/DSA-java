public class nextGreatestLetter { public char nextGreatestLetter(char[] letters, char target) {
    int start = 0 ;
    int end = letters.length-1;
    while(start<=end){
        int mid = start + ( end - start)/2;

        if (target<letters[mid])
        { end = mid-1 ;}
        else if (target>=letters[mid])
        { start = mid +1;

        }


    }           return letters[start % letters.length ];}

    public static void main(String[] args) {
        nextGreatestLetter obj = new nextGreatestLetter();

        char[] letters = {'c', 'f', 'j'};
        char target = 'j';

        char result = obj.nextGreatestLetter(letters, target);

        System.out.println("Next greatest letter: " + result);
}

}
