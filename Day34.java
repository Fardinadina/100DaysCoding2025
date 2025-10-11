package pkg100days;

public class Day34 {

    public static void main(String[] args) {

        int umur = 22;
        int gaji = 4500000;
        boolean kerja = true;

        boolean cukupUmur = (umur >= 21 && umur <= 35);
        boolean gajiLayak = (gaji >= 4000000 || umur > 25);
        boolean statusKerja = (!kerja);

        System.out.println("Cukup umur (21–35): " + cukupUmur);
        System.out.println("Gaji layak (≥4 juta atau umur >25): " + gajiLayak);
        System.out.println("Tidak sedang bekerja: " + statusKerja);
        System.out.println("Dapat melamar pinjaman: " + (cukupUmur && gajiLayak && !statusKerja));
    }
}
