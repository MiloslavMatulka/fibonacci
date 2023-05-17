package org.example.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(long n) {
        long n1 = 0L;
        long n2 = 1L;
        if (n == 1) {
            System.out.print(n1);
        } else if (n == 2) {
            System.out.print(n1 + " " + n2);
        } else if (n > 2) {
            System.out.print(n1 + " " + n2);
            long n3;
            for (long i = 0; i < n - 2; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        }
        System.out.println();
    }

    public static long fibonacciRecursively(long n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursively(n - 1)
                    + fibonacciRecursively(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci sequence elements >> ");
        try {
            long n = scanner.nextLong();
            System.out.println("Fibonacci sequence:");
            printFibonacci(n);

            System.out.println("Fibonacci sequence recursively:");
            for (long i = 0; i < n; ++i) {
                System.out.print(fibonacciRecursively(i) + " ");
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Not a correct number");
        }
    }
}
