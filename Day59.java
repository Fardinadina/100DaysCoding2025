package pkg100days;

import java.util.Scanner;

public class Day59 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();

        System.out.print("1 - N untuk ganjil: ");
        for (int i = 1; i <= N; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("1 - N untuk genap: ");
        for (int i = 2; i <= N; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
