package java101;

import java.util.Scanner;

public class HavaSicaklikEtkinlik {
    public static void main(String[] args) {
        double sicaklik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Hava sıcaklığı kaç derece (celcius) : ");
        sicaklik = inp.nextDouble();

        if (sicaklik < 5){
            System.out.println("Kayak yapmak için güzel bir gün :)");
        }
        else if (sicaklik >=5 && sicaklik <15){
            System.out.println("Sinema güzel bir fikir :)");
        }
        else if (sicaklik >=15 && sicaklik < 25){
            System.out.println("Piknik yapabilirsin :)");
        }
        else {
            System.out.println("Yüzmek en iyisi yha :)");
        }
    }
}
