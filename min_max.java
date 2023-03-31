package java101;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int number;
        int i = 1;
        int max=0, min=0;

        do {
            System.out.println(i+". Sayıyı giriniz: ");
            number = input.nextInt();

            if(i==1){
                max=number;
                min=number;
            }
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }

            i++;
        } while(i<=n);

        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);

    }

    }

