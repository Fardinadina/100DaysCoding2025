package pkg100days;

import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();

        System.out.print("1 - N : ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("N - 1 : ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
