package pkg100days;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gender;
        int umur;

        System.out.print("gender : ");
        gender = input.nextLine();
        System.out.print("umur : ");
        umur = input.nextInt();

        if (gender.equalsIgnoreCase("laki-laki")) {
            if (umur >= 19) {
                System.out.println("anda seorang " + gender + " berumur " + umur + " tahun, sudah dewasa");
            } else if (umur >= 13) {
                System.out.println("anda seorang " + gender + " berumur " + umur + " tahun, sudah remaja");
            } else {
                System.out.println("anda seorang " + gender + " berumur " + umur + " tahun, masih anak-anak");
            }
        } else {
            System.out.println("diabaikan");
        }
    }
}
