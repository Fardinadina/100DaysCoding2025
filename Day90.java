package pkg100days;
import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = hitungJumlah(angka1, angka2);

        System.out.println("Hasilnya: " + hasil);
    }

    public static int hitungJumlah(int a, int b) {
        return a + b;
    }
}
