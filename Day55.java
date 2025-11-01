package pkg100days;

import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan batas inputan : ");
        int n = input.nextInt();
        int[] angka = new int[n];
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("angka " + (i+1)+" = ");
        angka[i]= input.nextInt();
        max = angka[0];
        min = angka[0];
        if(max < angka[i]){
            max = angka[i];
        }
        if(min > angka[i]){
            min = angka[i];
        }
        }
        System.out.println("ini adalah angka max : "+max);
        System.out.println("ini adalah angka min : "+min);
    }
    
}
