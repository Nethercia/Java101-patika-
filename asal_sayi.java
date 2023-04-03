package java101;

import java.util.Scanner;

public class asal_sayi {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            boolean b = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(i + " ");
            }
        }
    }
}

