package pkg100days;

import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int j = i; j > 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

  
