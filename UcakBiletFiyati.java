package java101;

import java.util.Scanner;
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
public class UcakBiletFiyati {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double km, tutar, perkm;
        int yas, yolculuktipi;
        perkm = 0.10;
        System.out.println("Gidiceğiniz mesafe (km cinsinden) : ");
        km = inp.nextDouble();

        System.out.println("Yaşınız : ");
        yas = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 ==> Tek yön --- 2 ==> Gidiş-Dönüş)");
        yolculuktipi = inp.nextInt();

        if (!(yolculuktipi == 1 || yolculuktipi == 2) || (yas <= 0) || (km <= 0)){
            System.out.println("Hatalı giriş yaptınız !!!!");
        }

        switch (yolculuktipi){
            case 1:
                tutar = km * perkm;
                if (yas < 12){
                    System.out.println("İndirimsiz toplam tutar : "+tutar);
                    tutar -= tutar * (0.50);
                    System.out.println("12 yaşından küçük indirimli toplam tutar (%50): "+tutar);
                }
                else if (yas >= 12 && yas < 24){
                    System.out.println("İndirimsiz toplam tutar : "+tutar);
                    tutar -= tutar * (0.10);
                    System.out.println("12 ile 24 yaş arası indirimli toplam tutar (%10) : "+tutar);
                }
                else if (yas >= 65){
                    System.out.println("İndirimsiz toplam tutar : "+tutar);
                    tutar -= tutar * (0.30);
                    System.out.println("65 yaş ve üzeri için toplam indirimli tutar (%30): "+tutar);
                }
                else{
                    System.out.println("toplam tutar : "+tutar);
                }
                break;
            case 2:
                if (yas < 12){
                    tutar = (2*km) * perkm;
                    tutar -= tutar * (0.50);
                    System.out.println("12 yaşından küçük indirimli toplam tutar (%50): "+tutar);
                    tutar -= tutar * (0.20);
                    System.out.println("Gidiş - Dönüş %20 indirimli tutar : "+tutar);
                }
                else if (yas >= 12 && yas < 24){
                    tutar = (2*km) * perkm;
                    tutar -= tutar * (0.10);
                    System.out.println("12 ile 23 yaş arası indirimli toplam tutar (%10) : "+tutar);
                    tutar -= tutar * (0.20);
                    System.out.println("Gidiş - Dönüş %20 indirimli tutar : "+tutar);
                }
                else if (yas >= 65){
                    tutar = (2*km) * perkm;
                    tutar -= tutar * (0.30);
                    System.out.println("65 yaş ve üzeri için indirimli toplam tutar (%30) :  "+tutar);
                    tutar -= tutar * (0.20);
                    System.out.println("Gidiş - Dönüş %20 indirimli tutar : "+tutar);
                }
                else{
                    tutar = (2*km) * perkm;
                    tutar -= tutar * (0.20);
                    System.out.println("toplam tutar (%20 indirimli) : "+tutar);
                }
                break;

        }





    }
}
