package java101;

import java.util.Scanner;

public class mukemmel_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;


        System.out.print("Sayı giriniz : ");
        number = input.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " Sayısı mükemmel sayıdır.");
        } else {
            System.out.println(number + " Sayısı mükemmel sayı değildir.");
        }


    }
}
