package a3_parenthesis_checker;

import java.util.Stack;

public class ParenthesisChecker {
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
