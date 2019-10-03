package ru.mishapan.tasks.task1;

import java.util.HashSet;
import java.util.Set;


class EqualsCounter {

    private Set<String> set = new HashSet<>();

    public EqualsCounter() {
    }

    public void equalsCountFinder(String[] strings) {

        for (String string : strings) {

            int counter = 0;

            if (!set.contains(string)) {

                set.add(string);

                for (String str : strings) {
                    if (string.equals(str)) {
                        counter++;
                    }
                }

                System.out.println(" Value: " + string + " Count: " + counter);
            }
        }
    }
}

public class Task1Test2 {

    public static void main(String[] args) {

        String[] strings = {"a", "b", "f", "b", "a", "z", "i", "a", "d", "d", "d", "z"};

        EqualsCounter eq = new EqualsCounter();

        eq.equalsCountFinder(strings);
    }
}