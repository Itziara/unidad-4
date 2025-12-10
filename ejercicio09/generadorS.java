package ejercicio09;

import java.util.Scanner;

public class generadorS {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        int n;

        System.out.println("Dame un valor entero positivo");
        n = input.nextInt();

        System.out.println("Generando secuencia hasta " + n + ":");
        generarSecuencia(n);

        input.close();

    }

    public static int generarSecuencia (int n){


        for (int i = 1; i <= n; i++) {


            if (i % 2 == 0) {
                System.out.println(i + " Par");
            } else {
                System.out.println(i + " Impar");
            }
        }

        return 0;


    }
}
