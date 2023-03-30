package java101;

import java.util.Scanner;

public class harmonik_sayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        double total = 0;
        do {
            System.out.print("Bulmak istediğiniz Harmonik sayı : ");
            a = inp.nextInt();
            if (a < 0){
                System.out.println("Pozitif bir sayı girin!");
            }
            for (double i = 1; i <= a; i++){
                total += 1/i;
            }
            System.out.println(a +" Harmonik sayı değeri : "+total);
        }while (a < 0);

    }
}
