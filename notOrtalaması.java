import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
            System.out.println("Matematik notunuzu giriniz : ");
            mat = input.nextInt();

            System.out.println("fizik notunuzu giriniz : ");
            fizik = input.nextInt();

            System.out.println("kimya notubuzu giriniz : ");
            kimya = input.nextInt();

            System.out.println("Türkçe notunuzu giriniz : ");
            turkce = input.nextInt();

            System.out.println("tarih notunuzu giriniz : ");
            tarih = input.nextInt();

            System.out.println("müzik notunuzu giriniz : ");
            muzik = input.nextInt();

            int toplam = mat + muzik + tarih + kimya + fizik + turkce;
            double ortalama = toplam/6.0;
            System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sıfta Kaldı");






    }
}
