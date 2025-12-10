package ejercicio08;

import java.util.Scanner;

public class busqueda {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        int[] numeros = new int[7];

        System.out.println("Ingresa 7 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número #" + (i + 1) + ": ");

            numeros[i] = input.nextInt();
        }

        System.out.print(" Ingresa el numero que desees buscar en el arreglo: ");

        int numeroBuscado = input.nextInt();

        int indice = 0;
        boolean encontrado = false;

        while (indice < numeros.length) {


            if (numeros[indice] == numeroBuscado) {
                encontrado = true;
                System.out.println("Numero encontrado");
                System.out.println("El numero se encuentra en el indice: " + indice);
                break;
            }


            indice++;
        }


        if (!encontrado) {
            System.out.println("El número no se encontro en el arreglo");
        }


        input.close();
    }
}
