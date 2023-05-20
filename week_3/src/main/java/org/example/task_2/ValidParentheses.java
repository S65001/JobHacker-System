package org.example.task_2;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        characterStack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!characterStack.empty()) {
                char parenthes = characterStack.peek();
                if ((s.charAt(i) == '}') && (parenthes == '{')) {
                    characterStack.pop();
                } else if ((s.charAt(i) == ']') && (parenthes == '[')) {
                    characterStack.pop();
                } else if ((s.charAt(i) == ')') && (parenthes == '(')) {
                    characterStack.pop();
                } else {
                    characterStack.push(s.charAt(i));
                }
            } else {
                characterStack.push(s.charAt(i));
            }

        }
        if (characterStack.empty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String input="{()}";
        System.out.println(isValid(input));
    }
}
