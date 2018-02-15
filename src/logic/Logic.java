package logic;

import java.util.Scanner;

public class Logic {
    public static void logic( int lenght ){
        Integer[] arg = new Integer[lenght];
        for  ( int i = 0 ; i < lenght ; i++ ){
            System.out.println("Введите аргумент: ");
            Scanner num = new Scanner(System.in);
            arg[i] = num.nextInt();
        }

        int maxValue = arg[0] + arg[lenght-1];
        for ( int k = 1 ; k < Math.round( lenght ); k++ ){

            int x = arg[k] + arg[lenght-1-k];

            if ( x > maxValue  ){
                maxValue = x;
            }
        }
        System.out.println("Максимальная сумма: " + maxValue);
    }
}
