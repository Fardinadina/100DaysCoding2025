package pkg100days;

import java.util.Scanner;

public class Day77 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        String hasilTrim = teks.trim();
        String hasilSubstring = "";
        if (hasilTrim.length() >= 5) {
            hasilSubstring = hasilTrim.substring(0, 5);
        }
        String hasilReplace = hasilTrim.replace("a", "@");

        System.out.println("\n~~~ HASIL MANIPULASI STRING ~~~");
        System.out.println("Teks asli      : '" + teks + "'");
        System.out.println("trim()         : '" + hasilTrim + "'");
        System.out.println("substring(0,5) : '" + hasilSubstring + "'");
        System.out.println("replace(a,@)   : '" + hasilReplace + "'");
    }
}
