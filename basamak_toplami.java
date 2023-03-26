package java101;

import java.util.Scanner;

public class basamak_toplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı girin : ");
        int number = input.nextInt();
        int tempnumb = number;
        int basvalue;
        int total = 0;

        while (tempnumb != 0) {
            basvalue = tempnumb % 10;
            total += basvalue;
            tempnumb /= 10;
        }
        System.out.println(total);
    }
}
