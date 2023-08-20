package backjoon.problem5622;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        map.put("ABC", 3);
        map.put("DEF", 4);
        map.put("GHI", 5);
        map.put("JKL", 6);
        map.put("MNO", 7);
        map.put("PQRS", 8);
        map.put("TUV", 9);
        map.put("WXYZ", 10);

        String string = scanner.nextLine();

        int answer = 0;
        for (int i = 0; i < string.length(); i++) {
            for (String key : map.keySet()) {
                if (key.contains(String.valueOf(string.charAt(i)))) {
                    answer += map.get(key);
                }
            }
        }

        System.out.println(answer);
    }
}
