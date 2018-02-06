package logic;

import java.util.Scanner;

public class Logic {
    public static void logic( int n , Integer[] arg ){
        int i;
        int k;
        for  ( i = 0 ; i < n ; i++ ){
            System.out.println("Введите аргумент: ");
            Scanner num = new Scanner(System.in);
            arg[i] = num.nextInt();
        }

        int maxValue = 0;
        for ( k = 0 ; k < n ; k++ ){
            int x = arg[k] + arg[n-1-k];

            if (x > maxValue){
                maxValue = x;
            }
        }
        System.out.println("Максимальная сумма: " + maxValue);
    }
}
