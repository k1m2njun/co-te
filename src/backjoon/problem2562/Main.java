package backjoon.problem2562;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            list1.add(num);
            list2.add(num);
        }

        Collections.sort(list2);
        Integer max = list2.get(8);
        System.out.println(max);
        System.out.println(list1.indexOf(max) + 1);
    }
}
