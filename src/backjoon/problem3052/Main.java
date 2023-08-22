package backjoon.problem3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        for (int i = 0 ; i < 10; i++) {
            int number = scanner.nextInt();
            set.add(number % 42);
        }

        System.out.println(set.size());
    }
}
