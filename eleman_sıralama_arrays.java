package java101;

import java.util.Arrays;
import java.util.Scanner;

public class eleman_sıralama_arrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin : ");
        int n = inp.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Dizinin "+ i + ". elemanını girin : ");
            arr[i] = inp.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Dizinin elemanları : "+ Arrays.toString(arr));
    }
}
