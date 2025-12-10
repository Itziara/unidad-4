package ejercicio05;

import java.util.Scanner;

public class clasificador {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        int calificacion;

        System.out.println("Dame tu calificacion solo del 0 al 100");
        calificacion = input.nextInt();

        if (calificacion <= 100 && calificacion >= 90){
            System.out.println("Sobresaliente");
        } else if (calificacion >= 80 && calificacion <= 89){
            System.out.println("Notable");
        } else if (calificacion >=70 && calificacion <= 79) {
            System.out.println("Aprobatorio");
        }else if (calificacion >=0 && calificacion <= 69){
            System.out.println("Reprobado");
        }




    }
}
