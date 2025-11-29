package pkg100days;

import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];
        int total = 0;

        System.out.println("\nMasukkan elemen array:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i];
        }

        System.out.println("\nTotal jumlah elemen array = " + total);
    }
}
