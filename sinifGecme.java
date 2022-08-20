package java101;

import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;
        double ortalama;
        int toplamNot = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = inp.nextInt();
        if (!(mat <= 0 || mat > 100)){
            toplamNot += mat;
        }

        System.out.println("Türkçe notunuz : ");
        turkce = inp.nextInt();
        if (!(turkce <= 0 || turkce > 100)){
            toplamNot += turkce;
        }

        System.out.println("Fizik notunuz : ");
        fizik = inp.nextInt();
        if (!(fizik <= 0 || fizik > 100)){
            toplamNot += fizik;
        }

        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();
        if (!(kimya <= 0 || kimya > 100)){
            toplamNot += kimya;
        }

        System.out.println("Müzik notunuz : ");
        muzik = inp.nextInt();
        if (!(muzik <= 0 || muzik > 100)){
            toplamNot += muzik;
        }

        ortalama = toplamNot / 5;

        if (ortalama <= 55){
            System.out.println("Kaldınız...");
        }
        else{
            System.out.println("Geçtiniz...");
        }
        System.out.println("Ortalamanız : " + ortalama);

    }
}
    
