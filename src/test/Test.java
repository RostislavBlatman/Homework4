package test;

public class Test {

    public static void size( int a ){
        if ( a < 0 ){
            throw new IllegalArgumentException("введён отрицательный размер массива");
        }

    }
}
