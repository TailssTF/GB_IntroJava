package home2;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                //LogArr(arr);
            }
        }

        PrintArr(arr);
        
        in.close();
    }
    
    public static void PrintArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    // public static void LogArr(int[] arr){
    //     Logger logger = Logger.getLogger("log.txt");
    //     logger.setLevel(Level.INFO);
    //     FileHandler fh = new FileHandler();
    //     logger.addHandler(fh);
    //     SimpleFormatter sFormat = new SimpleFormatter();
    //     fh.setFormatter(sFormat);
        
    //     for (int i = 0; i < arr.length; i++) {
    //         logger.log(Level.INFO, "%d ", arr[i]);
    //     }
    // }
    
}
