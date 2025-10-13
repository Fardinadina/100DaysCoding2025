package pkg100days;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Nested If ===");
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 60) {
            System.out.println("Lulus dengan nilai minimum.");

            if (nilai >= 80) {
                System.out.println("Nilai Anda sangat baik!");
            } else if (nilai >= 70) {
                System.out.println("Nilai Anda baik.");
            } else {
                System.out.println("Nilai Anda cukup.");
            }
        } else {
            System.out.println("Maaf, Anda tidak lulus.");
        }

        input.close();
    }
}
