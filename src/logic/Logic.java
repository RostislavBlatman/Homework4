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
        for ( int k = 0 ; k < n ; k++ ){
            if ( k == 0 ){
                maxValue = arg[k] + arg[n-1-k];
            }
            else if ( arg[k] <= arg[k-1] && arg[n-1-k] <= arg[n-k]) {
                continue;
            }

            int x = arg[k] + arg[n-1-k];

            if ( x > maxValue  ){
                maxValue = x;
            }
        }
        System.out.println("Максимальная сумма: " + maxValue);
    }
}
