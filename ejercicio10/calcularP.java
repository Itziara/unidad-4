package ejercicio10;

import java.util.Scanner;

public class calcularP {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        float[] calificacion = new float[5];
        final int tamano = calificacion.length;

        System.out.println("Ingresa 5 calificaciones");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Introduce la calificacion #" + (i + 1) + ": ");

            calificacion[i] = input.nextInt();
        }

        float promedioFinal = calcularPromedio(calificacion, tamano);

        System.out.println("El promedio final de las 5 calificaciones es: " + promedioFinal);
        input.close();

    }

    public static float calcularPromedio (float[] arr, int tamano){

        float suma = 0.0f;

        for (int i = 0; i < tamano; i++) {
            suma += arr[i];
        }


        if (tamano > 0) {
            return suma / tamano;
        } else {
            return 0.0f;
        }


    }

}
