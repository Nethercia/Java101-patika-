package java101;

import java.util.Scanner;

/*Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun*/
public class Cin_zodyagi {
    public static void main(String[] args) {
        System.out.println("************* Çin zodyağı hesaplama *************");
        Scanner inp = new Scanner(System.in);
        int yil, b, kalan;
        b = 12;

        System.out.println("Doğum yılı giriniz : ");
        yil = inp.nextInt();
        kalan = yil%b;

        switch (kalan){
            case 0:
                System.out.println("Çin zodyağı burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin zodyağı burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz : At");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz : Koyun");
                break;
            default:
                System.out.println("HATALI GİRİŞ!");
        }


    }
}
