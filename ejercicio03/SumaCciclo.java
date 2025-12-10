package ejercicio03;

import java.util.Scanner;

public class SumaCciclo {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        int a;
        int b;
        long suma = 0;

        System.out.print("Introduce el numero de inicio del rango (entero positivo): ");
        a = input.nextInt();

        System.out.print("Introduce el numero de fin del rango (entero positivo): ");
        b = input.nextInt();

        if (a <= 0 || b <= 0) {
                System.out.println("Ambos numeros deben ser enteros positivos");
        } else if (a == b) {
                System.out.println("El numero de inicio debe ser diferente del número de fin");
        }

        while (a <= 0 || b <= 0 || a == b);



        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);

        System.out.println("Calculando suma del rango: [" + inicio + " a " + fin + "]");



        for (int i = inicio; i <= fin; i++) {
           suma += i;
        }



        System.out.println("La suma total de los números en el rango es: " + suma);
        input.close();



    }
}
