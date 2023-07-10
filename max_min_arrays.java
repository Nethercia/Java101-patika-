package java101;

import java.util.Arrays;
import java.util.Scanner;

public class max_min_arrays {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int[] list = {43, 8, 65, -1, 5, 34, 534, -245, 12, 27, -54, -23};
        System.out.println(Arrays.toString(list));
        System.out.print("Sayı girin : ");
        int number = inp.nextInt();
        Arrays.sort(list);

        int minValue = list[0];
        int maxValue = list[list.length-1];

        for (int i = 0; i < list.length; i++){
            if (list[i] < number){
                if (list[i] > minValue){
                    minValue = list[i];
                }
            }
        }
        System.out.println("Girdiğiniz sayıya en yakın küçük sayı = "+minValue);

        for (int j = 0 ; j < list.length; j++){
            if (list[j] > number){
                if (list[j] < maxValue){
                    maxValue = list[j];
                }
            }
        }
        System.out.println("Girdiğiniz sayıya yakın en büyük sayı = "+maxValue);


    }
}
