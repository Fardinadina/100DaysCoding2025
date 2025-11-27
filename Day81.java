package pkg100days;

import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\n=== Hasil Akses Elemen ===");
        System.out.println("Indeks 0: " + angka[0]);
        System.out.println("Indeks 1: " + angka[1]);
        System.out.println("Indeks 2: " + angka[2]);
        System.out.println("Indeks 3: " + angka[3]);
        System.out.println("Indeks 4: " + angka[4]);
    }
}
