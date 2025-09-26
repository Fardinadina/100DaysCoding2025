
package pkg100days;

public class Day20 {
    public static void main(String[] args) {
        // Value Of dan to String dia mengubah primtif menjadi String
       
        int angka = 123;
        String angka1 = String.valueOf(angka);
        System.out.println("valueOf : "+angka1);
       
        int angka2 = 1234;
        String angka3 = Integer.toString(angka2);
        System.out.println("toString : "+angka3);
    }
}
