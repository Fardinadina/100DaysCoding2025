package pkg100days;

import java.util.Scanner;

public class Day57 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris : ");
        int baris = input.nextInt();

        int i = 1;

        do {
            int j = 1;

            do {
                System.out.print("* ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;

        } while (i <= baris);

        input.close();
    }
}
