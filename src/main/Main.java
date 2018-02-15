package main;


import java.util.Scanner;
import logic.Logic;
import test.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество чисел: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        Test.size ( n );
        Logic.logic( n );

    }
}
