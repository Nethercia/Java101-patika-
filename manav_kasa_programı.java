package java101;

import java.util.Scanner;

/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
public class manav_kasa_programı {
    public static void main(String[] args) {
      double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , badılcan = 5.00 ;
      double kg, toplam_tutar;
      Scanner inp = new Scanner(System.in);
      System.out.println("Armut kaç kilo : ");
        kg = inp.nextDouble();
       double tutar1 = armut * kg;
      System.out.println("Elma kaç kilo : ");
        kg = inp.nextDouble();
        double tutar2 = elma * kg;
      System.out.println("Domates kaç kilo : ");
        kg = inp.nextDouble();
        double tutar3 = domates * kg;
      System.out.println("Muz kaç kilo : ");
        kg = inp.nextDouble();
        double tutar4 = muz * kg;
      System.out.println("Badılcan kaç kilo : ");
        kg = inp.nextDouble();
        double tutar5 = badılcan * kg;
        toplam_tutar = tutar1+tutar2+tutar3+tutar4+tutar5;
       System.out.println("toplam tutar : "+toplam_tutar);
    }
}
