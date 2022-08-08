import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c ;
        Scanner n = new Scanner( System.in );
        System.out.println( "Introduce dos números: ");
        a = n.nextInt();
        b = n.nextInt();
        c = a + b;
        System.out.println( "La suma es: "+c );
    }
}