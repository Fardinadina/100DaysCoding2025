package pkg100days;

import java.util.Scanner;

public class Day95 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks yang ingin dicetak: ");
        String teks = input.nextLine();

        System.out.print("Masukkan jumlah pengulangan: ");
        int jumlah = input.nextInt();

        cetakTeks(teks, jumlah);
    }


    public static void cetakTeks(String kalimat, int ulang) {
        for (int i = 1; i <= ulang; i++) {
            System.out.println(i + ". " + kalimat);
        }
    }
}
