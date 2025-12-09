package pkg100days;

import java.util.Scanner;

public class Day93 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pecahan: ");
        double angka = input.nextDouble();

        System.out.println("\n=== HASIL PEMBULATAN ===");
        System.out.println("ceil  : " + Math.ceil(angka));
        System.out.println("floor : " + Math.floor(angka));
        System.out.println("round : " + Math.round(angka));
    }
}
