package pkg100days;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        double hasil;

        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan: " + hasil);
        }
        if (pilihan == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan: " + hasil);
        }
        if (pilihan == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian: " + hasil);
        }
        if (pilihan == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: Tidak bisa membagi dengan nol!");
            }
        }
        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
