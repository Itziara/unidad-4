package ejercicio02;

import java.util.Scanner;

public class contraseñaSimple {
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        String contrasena;

        System.out.println("Dame la contraseña a guardar");
        contrasena = input.nextLine();

        System.out.println("Iniciar sesion");

        String contrasenaIngresada;
        int intentos = 0;
        final int MAX_INTENTOS = 3;
        boolean accesoConcedido = false;

        while (intentos < MAX_INTENTOS) {

            System.out.print("Introduce la contraseña (Intento " + (intentos + 1) + "/" + MAX_INTENTOS + "): ");
            contrasenaIngresada = input.nextLine();

            if (contrasenaIngresada.equals(contrasena)) {
                accesoConcedido = true;
                System.out.println("Acceso concedido");
                break;
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta.");
            }
        }

        if (!accesoConcedido) {
            System.out.println("Acceso denegado. Contacte a soporte.");
        }

        input.close();


    }
}
