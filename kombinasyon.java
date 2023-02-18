import java.util.Scanner;

public class kombinasyon {
    /*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
 n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
    */
    public static void main(String[] args) {
        int n, r, fak1 = 1, fak2 = 1, fak3 = 1;
        double con;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısı: ");
        n = inp.nextInt();
        System.out.print("Grup sayısı sayısı: ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            fak1 = fak1 * i;
        }
        for (int i = 1; i <= r; i++) {
            fak2 = fak2 * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            fak3 = fak3 * i;
        }
        con = fak1 / (fak2 * fak3);

        System.out.print("("+n+","+r+") kombinasyonu = "+con);


    }
}
