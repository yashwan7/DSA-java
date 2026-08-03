import java.util.Stack;

public class lc20ValidParentheses {
//"Push first. Opposite milte hi previous matching hai to pop, nahi to false
//firt stack
//then uska opposite milte hi  see if previos of that opposiite if matching one if yes then pop them both if not return false
//not all
//( ) then immidetely pop
//move next
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                } }
        }
     return stack.isEmpty();
    }
}
}