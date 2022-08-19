package java101;

import java.util.Scanner;

public class basitHesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a, b;
        int select;
        System.out.println("İlk sayıyı giriniz : ");
            a = inp.nextDouble();
        System.out.println("İkinci sayıyı giriniz : ");
            b = inp.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçin : ");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n");
            select = inp.nextInt();
        switch (select) {
            case 1:
                System.out.println("Sonuç : " + (a + b));
                break;
            case 2:
                System.out.println("Sonuç : " + (a - b));
                break;
            case 3:
                System.out.println("Sonuç : " + (a * b));
                break;
            case 4:
                if (b==0)
                    System.out.println("0'a bölünmez");
                else
                    System.out.println("Sonuç : "+(a/b));
                break;
            default:
                System.out.println("Geçersiz griş");


            }
                }




        }






