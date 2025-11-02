package pkg100days;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka batas perulangan : ");
        int batas = input.nextInt();
        
        int i = 1;
        
        do {
            System.out.println("Perulangan ke : " + i);
            i++;
        } while (i <= batas);
        
        input.close();
    }
}
