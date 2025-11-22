package pkg100days;
import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        System.out.println("untuk method isEmpty(): " + teks.isEmpty());

        System.out.print("Bandingkan dengan (equals): ");
        String eq = input.nextLine();
        System.out.println("untuk method equals(): " + teks.equals(eq));

        System.out.print("Bandingkan dengan (equalsIgnoreCase): ");
        String eqi = input.nextLine();
        System.out.println("untuk method equalsIgnoreCase(): " + teks.equalsIgnoreCase(eqi));

        System.out.print("Cek mengandung kata: ");
        String kata = input.nextLine();
        System.out.println("untuk method contains(): " + teks.contains(kata));
    }
}
