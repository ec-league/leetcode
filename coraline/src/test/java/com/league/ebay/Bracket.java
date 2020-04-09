package com.league.ebay;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Bracket {

    public static boolean isValid(String str) {
        LinkedList<Character> stack = new LinkedList();
        for (int i = 0; i < str.length(); i++) {
            if (isLeftBracket(str.charAt(i))) {
                stack.add(str.charAt(i));
            } else if (isRightBracket(str.charAt(i))) {
                if (stack.size() == 0) {
                    return false;
                }
                char top = stack.peekLast();
                if (top == ('（') && str.charAt(i) == ')') {
                    stack.pollLast();
                } else if (top == ('{') && str.charAt(i) == '}') {
                    stack.pollLast();
                } else if (top == ('[') && str.charAt(i) == ']') {
                    stack.pollLast();
                } else {
                    return false;
                }
            }

        }
        if(stack.size() == 0){
            return true;
        }
        return false;
    }


    public static boolean isLeftBracket(char bracket) {
        if (bracket == '[' || bracket == '{' || bracket == '(') {
            return true;
        }
        return false;
    }

    public static boolean isRightBracket(char bracket) {
        if (bracket == ']' || bracket == '}' || bracket == ')') {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String str = "[{}]";
        System.out.println(isValid(str));
    }
}
