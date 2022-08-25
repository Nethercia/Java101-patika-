package java101;

import java.util.Scanner;

public class UceVeDorde_tamBolunen {
    public static void main(String[] args) {
        int sayi,toplam=0,bolunenSayilar = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz:");
        sayi=input.nextInt();
        for(int i =0;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                toplam+=i;
                bolunenSayilar++;
            }

        }
        ortalama= toplam/(bolunenSayilar-1);
        System.out.println("Bolunebilen Sayilarin Aritmetik Ortalamasi: "+ortalama);
    }
}
