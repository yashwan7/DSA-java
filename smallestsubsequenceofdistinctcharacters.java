public class smallestsubsequenceofdistinctcharacters {

    public String smallestSubsequence(String s) {
    int[] count = new int[26];
    for (char c : s.toCharArray()) count[c - 'a']++;

    boolean[] inResult = new boolean[26];
    Deque<Character> stack = new ArrayDeque<>(); // ye hi tera "result"

    for (char c : s.toCharArray()) {
        count[c - 'a']--; // ye character use ho gaya, count kam kar do

        if (inResult[c - 'a']) continue; // Q1: already hai? skip

        // Q2: top bada hai aur aage milega? toh nikaal do
        while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 0) {
            inResult[stack.pop() - 'a'] = false;
        }

        stack.push(c);
        inResult[c - 'a'] = true;
    }

    StringBuilder sb = new StringBuilder();
    for (char c : stack) sb.append(c);
    return sb.reverse().toString();
}
}

