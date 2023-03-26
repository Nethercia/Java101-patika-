package java101;

import java.util.Scanner;

public class sayının_uslu {
    public static void main(String[] args) {
        int n, k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = inp.nextInt();
        System.out.print("Üssü olacak sayı : ");
        k = inp.nextInt();

        int total = 1;
        int i;

        for (i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Cevap : " + total);

    }
}
