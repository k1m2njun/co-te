package backjoon.problem1157;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();
        List<Character> characters = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!characters.contains(c)) {
                characters.add(word.charAt(i));
                integers.add(1);
            } else if (characters.contains(c)) {
                integers.set(characters.indexOf(c), integers.get(characters.indexOf(c)) + 1);
            }
        }

        Integer max = 0;
        int index = 0;
        if (integers.size() > 1) {
            for (int i = 0; i < integers.size(); i++) {
                if (max < integers.get(i)) {
                    max = integers.get(i);
                    index = i;
                }
            }
        }

        Collections.sort(integers, Collections.reverseOrder());
        int num = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (num == integers.get(i)) {
                System.out.println("?");
                return;
            }
        }

        System.out.println(characters.get(index));
    }
}