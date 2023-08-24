package backjoon.problem10988;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chars = scanner.nextLine();
        int charsLength = chars.length();
        Stack<Character> stack = new Stack<>();
        int charsLengthWhat = charsLength/2;

        for (int i = 0; i < charsLength/2; i++) {
            stack.push(chars.charAt(i));
        }

        if (charsLength%2 == 1) charsLengthWhat += 1;

        for (int i = charsLengthWhat; i < charsLength; i++) {
            if (stack.peek().equals(chars.charAt(i))) {
                stack.pop();
            } else {
                stack.push(chars.charAt(i));
            }
        }

        if (stack.size() == 0 || stack.size() == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
