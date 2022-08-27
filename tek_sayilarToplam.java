package java101;

import java.util.Scanner;
/*
 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
 * kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları
 * toplayıp ekrana basan programı yazıyoruz.*/
public class tek_sayilarToplam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0, i;

        do {
            System.out.println("Enter number : ");
            i = inp.nextInt();

            if (i % 2 == 0 && i % 4 == 0) {

                total += i;

            }

        } while (i % 2 == 0);
        System.out.println("Total : " + total);
    }
}
