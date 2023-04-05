package java101;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        input.close();

        int firstNum = 0;
        int secondNum = 1;

        System.out.print(firstNum + " " + secondNum + " ");

        for (int i = 2; i < n; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
