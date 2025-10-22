package pkg100days;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-3): ");
        int angka = input.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Anda memilih angka satu");
                break;
            case 2:
                System.out.println("Anda memilih angka dua");
                break;
            case 3:
                System.out.println("Anda memilih angka tiga");
                break;
            default:
                System.out.println("Angka tidak dikenal");
        }
    }
}
