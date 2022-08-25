package java101;

import java.util.Scanner;

public class Artik_yil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.println("yılı giriniz : ");
        year = inp.nextInt();


        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }
        }

    }
}
