package test;

public class Test {

    public static void razmer( int a ){
        if ( a < 0 ){
            throw new IllegalArgumentException("введён отрицательный размер массива");
        }

    }
}
