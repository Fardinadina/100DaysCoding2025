package pkg100days;

import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        System.out.println("Masukkan nilai elemen array:");
        for (int i = 0; i < jumlah; i++) {
            data[i] = input.nextInt();
        }

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("Angka " + cari + " TIDAK ditemukan dalam array.");
        }
    }
}
