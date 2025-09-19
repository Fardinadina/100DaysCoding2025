
package pkg100days;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======INPUT DATA DIRI======");
        System.out.print("Masukkan nama  : ");
        String nm = input.nextLine();
        
        
        System.out.print("Masukkan umur  : ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan bb    : ");
        double bb = input.nextDouble();
        
        System.out.print("Masukkan tb    : ");
        double tb = input.nextDouble();
        
        System.out.println("====BIODATA SAYA ====");
        System.out.println("NAMA         :" + nm);
        System.out.println("UMUR         :" + umur);
        System.out.println("BERAT BADAN  :" + bb);
        System.out.println("TINGGI BADAN :" + tb);
        
        
    }
}
