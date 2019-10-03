package ru.mishapan.tasks.task3;


import java.util.Scanner;

class Comparator {

    public Comparator() {
    }

    public boolean closeFar(int a, int b, int c) {

        return (Math.abs(a - b) <= 1 && Math.abs(b - c) >= 2 && Math.abs(a - c) >= 2) ||
                (Math.abs(a - c) <= 1 && Math.abs(b - c) >= 2 && Math.abs(a - b) >= 2);
    }
}

public class Task3Test {

    public static void main(String[] args) {

        Comparator comp = new Comparator();
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.print("c: ");
        int c = in.nextInt();

        System.out.println(a + ", " + b + ", " + c + " -> " + comp.closeFar(a, b, c));
    }
}
