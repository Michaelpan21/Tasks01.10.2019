package ru.mishapan.tasks.task1;

import java.util.HashMap;
import java.util.Map;

class Strings {

    private int counter = 0;
    private String value;

    public Strings(String value) {
        this.value = value;
    }

    public void incCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public String getValue() {
        return value;
    }
}

public class Task1Test {

    public static void main(String[] args) {

        String[] strings = {"a", "b", "f", "b", "a", "z", "i", "a", "d", "d", "d", "i"};

        Map<String, Strings> map = new HashMap<>();

        for (String string : strings) {

            if (!map.containsKey(string)) {

                map.put(string, new Strings(string));

                for (String str : strings) {
                    if (string.equals(str)) {
                        map.get(string).incCounter();
                    }
                }
            }
        }

        for (Map.Entry<String, Strings> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getCounter());
        }
    }
}
