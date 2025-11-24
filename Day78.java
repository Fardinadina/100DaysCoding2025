package pkg100days;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("Karakter pertama: " + kalimat.charAt(0));
        System.out.println("Mengandung kata 'Java'? " + kalimat.contains("Java"));
        System.out.println("Huruf besar: " + kalimat.toUpperCase());
    }
}
