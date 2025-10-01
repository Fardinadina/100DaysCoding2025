package pkg100days;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran : ");
        double r = in.nextDouble();  // input jari-jari

        double luas = Math.PI * r * r;  // rumus luas lingkaran

        System.out.println("Luas lingkaran adalah : " + luas);
    }
}
