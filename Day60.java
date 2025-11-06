package pkg100days;

import java.util.Scanner;

public class Day60 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();

        System.out.print("Bilangan Ganjil N - 1: ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Bilangan Genap N - 1: ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
