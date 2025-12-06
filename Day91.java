package pkg100days;

import java.util.Scanner;

public class Day91 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        int umur = input.nextInt();

        tampilkanData(nama, umur);
    }

    public static void tampilkanData(String nama, int umur) {
        System.out.println(nama + " berumur " + umur + " tahun.");
    }
}


