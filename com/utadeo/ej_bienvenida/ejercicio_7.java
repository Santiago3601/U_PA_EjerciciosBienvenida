package com.utadeo.ej_bienvenida;

import java.util.Scanner;

public class ejercicio_7 {
    /*
     * Escribe un programa que imprime la serie Fibonacci hasta el número n de la serie. Por
     * ejemplo, si el usuario ingresa 7, el programa retorna: 1, 1, 2, 4, 7, 13, 24.
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Cuantos número Fibonacci a consultar");
            int a = Integer.parseInt(scan.nextLine());
            int b = 0;
            int c = 1;
            int d = 0;

            for (int x = 0; x < a; x++) {
                d = b + c;
                System.out.println(d);
                b = c;
                c=d;
            }


        } catch (Exception e) {
            System.out.println();
            System.out.println("Se presento el siguiente error: " + e);
        }


    }
}
