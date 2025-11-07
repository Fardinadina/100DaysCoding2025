package pkg100days;

import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 hingga " + N + " :");

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}



