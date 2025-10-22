package pkg100days;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU SEDERHANA ===");
        System.out.println("1. Lihat Data");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu (1-2): ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih: Lihat Data");
                break;
            case 2:
                System.out.println("Terima kasih, program selesai!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
