package pkg100days;
import java.util.Scanner;

public class Day89 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        tampilkanPesan(nama);
    }

    public static void tampilkanPesan(String nama) {
        System.out.println("Halo " + nama + "!");
    }
}
