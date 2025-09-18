package pkg100days;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tipe motor : ");
        String Motor = input.nextLine(); 
        
        System.out.print("Masukkan CC Motor : ");
        int CC = input.nextInt(); 
        System.out.println("CC Motor saya : " + CC  + " dan bermerek " + Motor);
        
        
    }
}
