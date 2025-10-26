package pkg100days;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan nilai ujian: ");
        int nilai = input.nextInt();

        String status = (nilai >= 60) ? "Lulus" : "Gagal";
        System.out.println("Status kamu: " + status);
    }
}
