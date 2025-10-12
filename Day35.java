    package pkg100days;

    import java.util.Scanner;

    public class Day35 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nilai DDP anda: ");
            int nilai = input.nextInt();

            // Contoh if-else
            if (nilai >= 75) {
                System.out.println("Selamat, anda lulus DDP!");
            } else {
                System.out.println("Maaf, anda belum lulus DDP.");
            }

           
        }
    }


