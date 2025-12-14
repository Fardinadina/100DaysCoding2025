package pkg100days;

import java.util.Scanner;

public class Day98 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("\nDeret Fibonacci dari 1 sampai " + n + " :");
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
