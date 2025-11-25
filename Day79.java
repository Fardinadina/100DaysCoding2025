package pkg100days;

import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username, password;
        String userLogin, passLogin;

        System.out.print("Buat username: ");
        username = input.nextLine();

        System.out.print("Buat password: ");
        password = input.nextLine();

        System.out.println("\n--- LOGIN ---");

        while (true) {
            System.out.print("Masukkan username: ");
            userLogin = input.nextLine();

            System.out.print("Masukkan password: ");
            passLogin = input.nextLine();

            if (userLogin.equals(username) && passLogin.equals(password)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Username atau password salah, coba lagi.\n");
            }
        }
    }
}
