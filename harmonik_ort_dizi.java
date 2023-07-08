package java101;

import java.util.Arrays;
import java.util.Scanner;

public class harmonik_ort_dizi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin : ");
        int n = inp.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin elamanlarını girin " + i + ". : ");
            arr[i] = inp.nextDouble();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / arr[i];
        }

        double harmonicAvarage = n / sum;
        System.out.println("Dizinin harmonik ortalaması : " + harmonicAvarage);


    }
}
