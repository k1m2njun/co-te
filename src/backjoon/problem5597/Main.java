package backjoon.problem5597;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
                    16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 28; i++) {
            Integer num = scanner.nextInt();

            if (list.contains(num)) {
                list.remove(num);
            }
        }

        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
