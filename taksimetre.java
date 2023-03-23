package java101;

import java.util.Scanner;

/*Taksimetre 
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
public class taksimetre {
    public static void main(String[] args) {
        double km, tutar, mesafe, toplam, acılıs;
        km = 2.20;
        acılıs = 10;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Gidilecek mesafe (km) : ");
        mesafe = girdi.nextInt();
        tutar = mesafe * km+10;
        toplam = (tutar < 20)? 20 : tutar;
            System.out.println("Km başına işlenen tutar : "+km);
            System.out.println("Taksimetre açılış : "+acılıs);
            System.out.println("Toplam ödenecek tutar : "+toplam+" TL");
    }
}
