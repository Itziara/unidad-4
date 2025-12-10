package ejercicio07;

import java.util.Scanner;

public class contadorVocales {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            char[] letras = new char[10];
            int contador = 0;

            System.out.println("Dame 10 letras");

            for (int i = 0; i < letras.length; i++) {
                System.out.print("Ingresa la letra en la posición " + (i + 1) + ": ");
                letras[i] = input.next().charAt(0);
            }


            for (int i = 0; i < letras.length; i++) {
                char letraMayuscula = Character.toUpperCase(letras[i]);


                switch (letraMayuscula) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':

                        contador++;
                        System.out.println("Vocal encontrada: " + letraMayuscula + " (Índice " + i + ")");
                        break;

                }
            }

            System.out.println("El número total de vocales es: " + contador);
        }
    }
}