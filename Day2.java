package pkg100days;
public class Day2 {
public static void main(String[] args) {
       
        // %d -> bilangan bulat (integer, byte, short, long)
        int angkaBulat = 11;

        // %f -> bilangan pecahan (float, double)
        double angkaPecahan = 11.0905;

        // %c -> karakter tunggal (char)
        char huruf = 'F';

        // %b -> nilai boolean (true/false)
        boolean status = true;

        // Cetak menggunakan printf
        System.out.printf("Bilangan bulat (%%d)   : %d%n", angkaBulat); 
        System.out.printf("Bilangan pecahan (%%f) : %f%n", angkaPecahan);
        System.out.printf("Karakter (%%c)         : %c%n", huruf);
        System.out.printf("Boolean (%%b)          : %b%n", status);
    }
}

