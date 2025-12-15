package pkg100days;

import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("\nBilangan prima dari 1 sampai " + n + " :");
        tampilPrima(n);
    }

    public static void tampilPrima(int n) {
        for (int i = 2; i <= n; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean cekPrima(int angka) {
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
