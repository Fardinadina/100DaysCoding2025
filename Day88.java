package pkg100days;

import java.util.Scanner;

public class Day88 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        System.out.println("Masukkan nilai elemen array:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        System.out.println("\nIsi array adalah:");
        for (int nilai : data) {
            System.out.println(nilai);
        }
    }
}
