import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int factorialnum = sc.nextInt();
        System.out.println("Ingresa un numero:  ");
        int factorial = 1;

        for (int i = 1; i < factorialnum ; i++) {
            factorial *= 1;
        }

        System.out.println("El factorial de " + factorialnum + " es " + factorial );
    }

    public static double factorial(int factorial) {
        Scanner sc  = new Scanner(System.in);
        int factorialnum = sc.nextInt();
        for (int i = 1; i < factorialnum ; i++) {
            factorial *= 1;
        }
        return factorial;
    }


}
