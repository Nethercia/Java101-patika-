package java101;
import java.util.Scanner;

public class _4_5_Kuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numb;
        System.out.println("Enter number : ");
        numb = inp.nextInt();

        for (int i = 1; i <= numb; i *= 4) {
                System.out.println(i);
        }
        System.out.println("-----------------------------------------------------");

        for (int i = 1; i <= numb; i *= 5) {
            System.out.println(i);
        }


    }
}
