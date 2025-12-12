package pkg100days;

import java.util.Scanner;

public class Day96 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        System.out.println("\n---- HASIL PERHITUNGAN -----");
        System.out.println("Penjumlahan: " + tambah(a, b));
        System.out.println("Pengurangan: " + kurang(a, b));
        System.out.println("Perkalian  : " + kali(a, b));
        System.out.println("Pembagian  : " + bagi(a, b));
    }

    public static double tambah(double x, double y) {
        return x + y;
    }

    public static double kurang(double x, double y) {
        return x - y;
    }

    public static double kali(double x, double y) {
        return x * y;
    }

    public static double bagi(double x, double y) {
        return x / y;
    }
}
