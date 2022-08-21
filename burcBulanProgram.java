package java101;

import java.util.Scanner;
/*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart*/
public class burcBulanProgram {
    public static void main(String[] args) {
        int  day;
        String month;
        Scanner inp = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        month = inp.nextLine();
        System.out.println("Doğduğunuz gün : ");
        day = inp.nextInt();

        if (month.equals("ocak")){
            if (day <= 21 && day >=1){
                System.out.println("Oğlak burcu");
            }
            else if (day >= 22 && day <= 31){
                System.out.println("Kova burcu");
            }
        }
        if (month.equals("şubat")){
            if (day <= 19 && day >=1){
                System.out.println("Kova burcu");
            }
            else if (day >= 20 && day <= 29){
                System.out.println("Balık burcu");
            }
        }
        if (month.equals("mart")){
            if (day <= 20 && day >=1){
                System.out.println("Balık burcu");
            }
            else if (day >= 21 && day <= 31){
                System.out.println("Koç burcu");
            }
        }
        if (month.equals("nisan")){
            if (day <= 20 && day >=1){
                System.out.println("Koç burcu");
            }
            else if (day >= 21 && day <= 30){
                System.out.println("Boğa burcu");
            }
        }
        if (month.equals("mayıs")){
            if (day <= 21 && day >=1){
                System.out.println("Boğa burcu");
            }
            else if (day >= 22 && day <= 31){
                System.out.println("İkizler burcu");
            }
        }
        if (month.equals("haziran")){
            if (day <= 22 && day >=1){
                System.out.println("İkizler burcu");
            }
            else if (day >= 23 && day <= 30){
                System.out.println("Yengeç burcu");
            }
        }
        if (month.equals("temmuz")){
            if (day <= 22 && day >=1){
                System.out.println("Yengeç burcu");
            }
            else if (day >= 23 && day <= 31){
                System.out.println("Aslan burcu");
            }
        }
        if (month.equals("ağustos")){
            if (day <= 22 && day >=1){
                System.out.println("Aslan burcu");
            }
            else if (day >= 23 && day <= 30){
                System.out.println("Başak burcu");
            }
        }
        if (month.equals("eylül")){
            if (day <= 22 && day >=1){
                System.out.println("Başak burcu");
            }
            else if (day >= 23 && day <= 31){
                System.out.println("Terazi burcu");
            }
        }
        if (month.equals("ekim")){
            if (day <= 22 && day >=1){
                System.out.println("Terazi burcu");
            }
            else if (day >= 23 && day <= 30){
                System.out.println("Akrep burcu");
            }
        }
        if (month.equals("kasım")){
            if (day <= 21 && day >=1){
                System.out.println("Akrep burcu");
            }
            else if (day >= 22 && day <= 31){
                System.out.println("Yay burcu");
            }
        }
        if (month.equals("aralık")){
            if (day <= 21 && day >=1){
                System.out.println("Yay burcu");
            }
            else if (day >= 22 && day <= 30){
                System.out.println("Oğlak burcu");
            }
        }
    }
}
