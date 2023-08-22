package backjoon.problem2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = N * 2 - 1;

        int count = 0;
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < Math.abs(a - N - i); j++) {
                System.out.print(" ");
            }
            if (i <= a/2) {
                for (int j = 0; j < Math.abs(1 + (i*2)); j++) {
                    System.out.print("*");
                }
            } else {
                count += 2;
                for (int j = a - count; j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
