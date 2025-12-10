package ejercicio01;

import java.util.Scanner;

public class AreaCon {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        double resultado;
        int seleccion;
        double radio;
        double base;
        double altura;


        System.out.println("CALCULADORA DE AREAS");
        System.out.println("Elige la figura para calcular el area");
        System.out.println("1. Círculo");
        System.out.println("2. Rectangulo");
        seleccion = input.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Dame el radio del círculo");
                radio = input.nextDouble();
                resultado = areaCirculo(radio);
                System.out.println("El radio del círculo es:" + resultado);
                evaluarResultado(resultado);
                break;


            case 2:
                System.out.println("Dame la base");
                base = input.nextDouble();
                System.out.println("Dame la altura");
                altura = input.nextDouble();
                resultado = areaRectangulo(base, altura);
                System.out.println("El radio del rectangulo es:" + resultado);
                evaluarResultado(resultado);
                break;



        }


    }

    public static double areaCirculo (double radio){
       double resultado;
       resultado = (3.14 * (radio * 2));
       return resultado;
    }

    public static double areaRectangulo (double base, double altura){
        double resultado;
        resultado = (base * altura);
        return resultado;
    }

    public static void evaluarResultado(double valor) {
        System.out.println("Evaluación del Área");

        if (valor > 100) {
            System.out.println("El resultado es mayor a 100.");
        } else if (valor < 100) {
            System.out.println("El resultado es menor a 100.");
        }
    }


}
