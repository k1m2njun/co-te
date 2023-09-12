package backjoon.problem2738;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] v1 = new int[N][M];
        int[][] v2 = new int[N][M];
        int[][] v3 = new int[N][M];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (i==0) {
                        v1[j][k] = scanner.nextInt();
                    } else {
                        v2[j][k] = scanner.nextInt();
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                v3[i][j] = v1[i][j] + v2[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(v3[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
