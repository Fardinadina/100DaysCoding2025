package pkg100days;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka panjang\t: "); 
        int p = in.nextInt();
         System.out.print("Masukkan angka luas\t: "); 
        int l = in.nextInt();
        
        int luaspersegipanjang = p * l;
        System.out.println("Luas persegi panjang \t:" + luaspersegipanjang);
        
        
    }
}
