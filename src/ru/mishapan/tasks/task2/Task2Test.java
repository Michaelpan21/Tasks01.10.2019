package ru.mishapan.tasks.task2;

import java.util.Scanner;

class Separator {

    public Separator() {
    }

    public String repeatSeparator(String word, String sep, int count) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(word);
            if (i != count - 1) {
                sb.append(sep);
            }
        }

        return sb.toString();
    }
}

public class Task2Test {

    public static void main(String[] args) {

        Separator sep = new Separator();

        Scanner in = new Scanner(System.in);
        System.out.print(" Type word: ");
        String word = in.nextLine();
        System.out.print(" Type separator: ");
        String separator = in.nextLine();
        System.out.print(" Type count of repeats: ");
        int count = in.nextInt();

        String result = sep.repeatSeparator(word, separator, count);
        System.out.println(result);
    }


}
