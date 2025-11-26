package pkg100days;

import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        System.out.println("Masukkan 5 angka:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nData array yang dimasukkan:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + ": " + angka[i]);
        }

        int max = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("\nNilai terbesar dalam array adalah: " + max);

        input.close();
    }
}
