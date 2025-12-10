package pkg100days;

import java.util.Scanner;

public class Day94 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        cetakData(nama, umur);
    }

    public static void cetakData(String nama, int umur) {
        System.out.println("\n---- HASIL OUTPUT ----");
        System.out.println("Nama Anda: " + nama);
        System.out.println("Umur Anda: " + umur + " tahun");
        
    }
}
