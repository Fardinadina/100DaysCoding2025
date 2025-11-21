package pkg100days;

import java.util.Scanner;

public class Day75 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String kalimat = input.nextLine();

        System.out.println("Panjang String: " + kalimat.length());
        System.out.println("Uppercase: " + kalimat.toUpperCase());
        System.out.println("Lowercase: " + kalimat.toLowerCase());
    }
}
