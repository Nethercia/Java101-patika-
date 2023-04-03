package java101;

import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, k, j;
        System.out.print("Basamak sayısını girin : ");
        a = input.nextInt();

        for (int i = a; i >= 1; i--) {
            for (k = 1; k <= a - i; k++){
                System.out.print(" ");
            }

            for (j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
