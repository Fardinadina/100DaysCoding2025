package pkg100days;

import java.util.Scanner;

public class Day97 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

        double hasil = hitungLuas(sisi);

        System.out.println("\nLuas Persegi = " + hasil);
    }

    public static double hitungLuas(double s) {
        return s * s;
    }
}
