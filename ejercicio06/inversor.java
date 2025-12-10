package ejercicio06;

import java.util.Scanner;

public class inversor {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        int [] numeros = new int[5];

        System.out.println("Dame 5 numeros enteros");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número en la posición " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("El orden inverso del arreglo es:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
        }



    }
}
