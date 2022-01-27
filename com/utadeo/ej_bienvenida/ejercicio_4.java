package com.utadeo.ej_bienvenida;

import java.util.Scanner;

public class ejercicio_4 {
    /*
     * Escribe un programa que determina si un número es una potencia de 2. Por ejemplo,
     * para los inputs como 1, 2, 4, 8 debe retornar verdadero; para 3, 5, 6, 10 retorna falso.
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Ingrese el número a consultar");
            int a = Integer.parseInt(scan.nextLine());

            if ((Math.log(a) / Math.log(2)) % 1 == 0) {
                System.out.println("Verdadero");
            } else {
                System.out.println("Falso");
            }


        } catch (Exception e) {
            System.out.println();
            System.out.println("Se presento el siguiente error: " + e);
        }


    }
}
