package java101;

import java.util.Scanner;
/*
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında
 ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını
 %8 olarak KDV tutarı hesaplayan programı yazınız.
 kdvYuzdesi = (kdvsizFiyat <= 1000)? 0.18 : 0.08;
 */

public class KDV_tutarı_odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvoran, kdvlifiyat, kdvtutar ;
        System.out.println("Tutar giriniz = ");
        tutar = input.nextInt();
        if (tutar <= 1000){
            kdvoran = 0.18;
            kdvtutar = tutar * kdvoran;
            kdvlifiyat = tutar + kdvtutar;
                System.out.println("KDV'siz tutar = "+tutar);
                System.out.println("KDV oranı = "+kdvoran);
                System.out.println("KDV tutarı = "+kdvtutar);
                System.out.println("KDV'li fiyat = "+kdvlifiyat);
        }
        else {
            kdvoran = 0.08;
            kdvtutar = tutar * kdvoran;
            kdvlifiyat = tutar + kdvtutar;
            System.out.println("KDV'siz tutar = "+tutar);
            System.out.println("KDV oranı = "+kdvoran);
            System.out.println("KDV tutarı = "+kdvtutar);
            System.out.println("KDV'li fiyat = "+kdvlifiyat);

        }
    }
}
