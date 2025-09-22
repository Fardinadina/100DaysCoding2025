package pkg100days;
public class Day13 {
    public static void main(String[] args) {
       
        int warisan = 120000000;
        int ahliwaris = 3;
        int potongan = warisan * 12/100;
        int hasilakhir = warisan-potongan;
        int hasilwarisan = hasilakhir / ahliwaris;
        System.out.println("pembagian warisan mariati: " + hasilwarisan);
        System.out.println("pembagian warisan rifai : " + hasilwarisan);
        System.out.println("pembagian warisan cipung: " + hasilwarisan);
 
    }
}

    