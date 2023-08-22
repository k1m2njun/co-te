package backjoon.problem1546;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        int M = list.get(N-1);

        double answer = 0;
        for (int i : list) {
            answer += (double) i / M * 100;
        }

        answer = answer/N;

        System.out.println(answer);
    }
}
