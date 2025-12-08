package pkg100days;

import java.util.Scanner;

public class Day92 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka 2: ");
        int b = input.nextInt();

        int hasil = jumlahkan(a, b);

        System.out.println("Hasil: " + hasil);
    }

    public static int jumlahkan(int x, int y) {
        return x + y;
    }
}
