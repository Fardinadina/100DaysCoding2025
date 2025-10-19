package pkg100days;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pendapatanUtama, pendapatanTambahan, pendapatanBersih, potongan;

        System.out.print("Masukkan pendapatan utama: ");
        pendapatanUtama = scanner.nextInt();

        System.out.print("Masukkan pendapatan tambahan: ");
        pendapatanTambahan = scanner.nextInt();

        System.out.print("Masukkan jumlah potongan: ");
        potongan = scanner.nextInt();

        pendapatanBersih = pendapatanUtama + pendapatanTambahan - potongan;
        System.out.println("Pendapatan bersih: " + pendapatanBersih);

        if (pendapatanBersih > 50000) {
            System.out.println("Keterangan: pendapatan tinggi");
        } else if (pendapatanBersih > 30000) {
            System.out.println("Keterangan: pendapatan cukup");
        } else {
            System.out.println("Keterangan: pendapatan rendah");
        }

        scanner.close();
    }
}
