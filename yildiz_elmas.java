package java101;

import java.util.Random;
import java.util.Scanner;

public class yildiz_elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Elmasın boyutunu giriniz: ");
        int boyut = input.nextInt();

        // Üst yarım elmas
        for (int i = 0; i <= boyut; i++) {
            for (int j = 0; j < boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Alt yarım elmas
        for (int i = boyut - 1; i >= 0; i--) {
            for (int j = 0; j < boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
