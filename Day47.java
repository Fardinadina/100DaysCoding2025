package pkg100days;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENENTUKAN HARI ===");
        System.out.println("1. Tentukan Hari");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu (1-2): ");

        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Masukkan angka (1-7): ");
                int angka = input.nextInt();

                switch (angka) {
                    case 1:
                        System.out.println("Hari Senin");
                        break;
                    case 2:
                        System.out.println("Hari Selasa");
                        break;
                    case 3:
                        System.out.println("Hari Rabu");
                        break;
                    case 4:
                        System.out.println("Hari Kamis");
                        break;
                    case 5:
                        System.out.println("Hari Jumat");
                        break;
                    case 6:
                        System.out.println("Hari Sabtu");
                        break;
                    case 7:
                        System.out.println("Hari Minggu");
                        break;
                    default:
                        System.out.println("Angka tidak valid! Masukkan angka 1-7.");
                }
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
