import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c ;
        Scanner m = new Scanner( System.in );
        System.out.println( "Introduce dos números: ");
        a = m.nextInt();
        b = m.nextInt();
        c = a * b;
        System.out.println( "La multiplicación es: "+c );


    }
}