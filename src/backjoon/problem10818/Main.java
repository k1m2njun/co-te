package backjoon.problem10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int min = 1000001;
        int max = -1000000;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            if (min > a) min = a;
            if (max < a) max = a;
        }

        System.out.println(min + " " + max);
    }
}
