package pkg100days;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menu Sederhana ===");
        System.out.println("1. Lihat Data");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu (1-2): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih: Lihat Data");
        }
        if (pilihan == 2) {
            System.out.println("Keluar dari program...");
        }
        if (pilihan < 1 || pilihan > 2) {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
