
import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan nilainya: ");
        int N = s.nextInt();
        int count = 0;

        for (char c : String.valueOf(N).toCharArray()) {
            if (c == '0') {
                count++;
            }
        }

        System.out.println("jumlah nolnya : " + count);
    }
}
