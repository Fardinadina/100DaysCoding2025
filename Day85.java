package pkg100days;

import java.util.Scanner;

public class Day85 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        System.out.println("Masukkan nilai elemen array:");
        for (int i = 0; i < jumlah; i++) {
            data[i] = input.nextInt();
        }

        int maksimal = data[0];

        for (int i = 1; i < jumlah; i++) {
            if (data[i] > maksimal) {
                maksimal = data[i];
            }
        }

        System.out.println("Angka maksimal dalam array adalah: " + maksimal);
    }
}
