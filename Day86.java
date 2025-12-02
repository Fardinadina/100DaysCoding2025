package pkg100days;

import java.util.Scanner;

public class Day86 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        System.out.println("Masukkan nilai elemen array:");
        for (int i = 0; i < jumlah; i++) {
            data[i] = input.nextInt();
        }

        int minimal = data[0];

        for (int i = 1; i < jumlah; i++) {
            if (data[i] < minimal) {
                minimal = data[i];
            }
        }

        System.out.println("Angka minimal dalam array adalah: " + minimal);
    }
}
