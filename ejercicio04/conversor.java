package ejercicio04;

import java.util.Scanner;

public class conversor {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        double numero;
        int opcion;

        System.out.println("dame un valor numerico");
        numero = input.nextDouble();
        System.out.println("Escoge una de las siguientes opciones");
        System.out.println("1. kilometros a millas");
        System.out.println("2. centigrados a fahrenheit");
        System.out.println("3. metros a pies");
        opcion = input.nextInt();

        switch (opcion){
            case 1:
                System.out.println("las millas son:" + kilometros(numero));
                break;

            case 2:
                System.out.println("los grados fahrenheit son:" + centigrados(numero));
                break;

            case 3:
                System.out.println("los pies son:" + metros(numero));
                break;
        }


    }

    public static double kilometros (double numero){
        double resultado;
        resultado = numero * 0.621371;
        return resultado;
    }

    public static double centigrados (double numero){
        double resultado;
        resultado = numero * (9 / 5) + 32;
        return resultado;
    }

    public static double metros (double numero){
        double resultado;
        resultado = numero * 3.28084;
        return resultado;
    }
}
