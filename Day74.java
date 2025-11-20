package pkg100days;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Katakan Halo");
            System.out.println("2. Keluar");
            System.out.print("Pilih (1-2): ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo! Selamat anda mendapatkan uang sebesar 11 M");
                    break;
                case 2:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 2);
    }
}
