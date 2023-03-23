package java101;

import java.util.Scanner;

/*
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
public class daire_alan_cevre_odev {
    public static void main(String[] args) {
        double pi = 3.14, a, alan, r;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        r = girdi.nextDouble();
        System.out.println("Dairenin merkez yarıçao ölçünü giriniz : ");
        a = girdi.nextDouble();
        alan = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı : "+alan);
    }
}
