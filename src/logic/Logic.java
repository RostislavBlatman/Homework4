package logic;

import java.util.Scanner;

public class Logic {
    public static void logic( Integer[] arg ){
        int n = arg.length;
        for  ( int i = 0 ; i < n ; i++ ){
            System.out.println("Введите аргумент: ");
            Scanner num = new Scanner(System.in);
            arg[i] = num.nextInt();
        }

        int maxValue = 0;
        for ( int k = 0 ; k < Math.round( n ); k++ ){
            if ( k == 0 ){
                maxValue = arg[k] + arg[n-1-k];
            }

            int x = arg[k] + arg[n-1-k];

            if ( x > maxValue  ){
                maxValue = x;
            }
        }
        System.out.println("Максимальная сумма: " + maxValue);
    }
}
