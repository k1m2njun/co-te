package backjoon.problem10811;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;
            int temp = 0;
            for (int j = 0; j < end - start + 1; j++) {
                for (int k = start; k < end - j; k++) {
                    temp = basket[k];
                    basket[k] = basket[k+1];
                    basket[k+1] = temp;
                }
            }
        }

        for (int n : basket) {
            System.out.print(n + " ");
        }
    }
}
