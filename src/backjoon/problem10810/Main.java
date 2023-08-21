package backjoon.problem10810;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] basket = new int[N];

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt();
            int number = scanner.nextInt();
            for (int j = start; j < end; j++) {
                basket[j] = number;
            }
        }

        for (int n : basket) {
            System.out.print(n + " ");
        }
    }
}
