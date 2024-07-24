package 문제;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(checkParenthesis(sc.next()));
        }

    }
    public static String checkParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                stack.push('(');

            }else if(stack.empty()) {
                return "NO";

            }else {
                if(stack.size() > 0) {
                    stack.pop();
                }
            }
        }
        if(stack.empty()) {
            return "YES";

        }else {
            return "NO";
        }
    }
}
