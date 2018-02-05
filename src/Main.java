import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество чисел: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        Integer[] arg = new Integer[n];
        int i = 0;
        int k = 0;
        while (i < n){
            System.out.println("Введите аргумент: ");
            arg[i] = num.nextInt();
            i++;
        }
        int maxValue = 0;
        while (k < n ){
            int x = arg[k] + arg[n-1-k];
            k++;
            if (x > maxValue){
                maxValue = x;
            }
        }
        System.out.println("Максимальная сумма: " + maxValue);
    }
}
