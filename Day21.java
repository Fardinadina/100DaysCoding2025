package pkg100days;

public class Day21 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Nilai sebelum ditukar : ");
        System.out.println("nilai a : " + a);
        System.out.println("nilai b : " + b);

        a = a + b; // a = 10 + 5 = 15
        b = a - b; // b = 15 - 5 = 10
        a = a - b; // a = 15 - 10 = 5

        System.out.println("Nilai setelah ditukar : ");
        System.out.println("nilai a : " + a);
        System.out.println("nilai b : " + b);
    }
}

