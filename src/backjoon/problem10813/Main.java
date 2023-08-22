package backjoon.problem10813;

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

        int temp = 0;

        for (int i = 0; i < M; i++) {
            int basket01 = scanner.nextInt() - 1;
            int basket02 = scanner.nextInt() - 1;

            temp = basket[basket01];
            basket[basket01] = basket[basket02];
            basket[basket02] = temp;
        }

        for (int n : basket) {
            System.out.print(n + " ");
        }
    }
}
