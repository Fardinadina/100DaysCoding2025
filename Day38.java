package pkg100days;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menentukan Bilangan Positif, Negatif, atau Nol ===");
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan ini adalah POSITIF.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan ini adalah NEGATIF.");
        } else {
            System.out.println("Bilangan ini adalah NOL.");
        }

        input.close();
    }
}
