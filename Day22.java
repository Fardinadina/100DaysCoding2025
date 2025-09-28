package pkg100days;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka \t: ");   
        int sisi = in.nextInt();
        int luaspersegi = sisi * sisi;
        System.out.println("Luas persegi \t: " + luaspersegi);
    }
}
