package home3;

import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Исходный массив:");
        arrPrint(arr);

        System.out.println("Без четных чисел:");
        int[] odd = new int[n];
        System.arraycopy(arr, 0, odd, 0, n);
        for (int i = 0; i < odd.length; i++) {
            if (odd[i] % 2 == 0) odd = arrDel(odd, i);
        }
        arrPrint(odd);

        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int mean = 0;

        for (int i = 1; i < odd.length; i++) {
            if (arr[i] < min) min = arr[i];
            else if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        mean = (sum) / arr.length;

        System.out.printf("Минимальное: %d\nМаксимальное: %d\nСреднее: %d\n", min, max, mean);


        in.close();
    }

    public static void arrPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static int[] arrDel(int[] arr, int n){
        int len = arr.length - 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < n) res[i] = arr[i];
            else res[i] = arr[i+1];
        }
        return res;
    }
}
