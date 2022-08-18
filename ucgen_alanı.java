package java101;

import java.util.Scanner;
/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.*/
public class ucgen_alanı {
    public static void main(String[] args) {
        double a, b, c, u, cevre, alan;
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. kenar uzunluğu : ");
        a = girdi.nextInt();
        System.out.println("2. kenar uzunluğu : ");
        b = girdi.nextInt();
        System.out.println("3. kenar uzunluğu : ");
        c = girdi.nextInt();
        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan : "+alan);

    }
}
