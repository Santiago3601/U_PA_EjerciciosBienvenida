package com.utadeo.ej_bienvenida;

import java.util.Scanner;

public class ejercicio_3 {
    /*
     * Escribe un programa para verificar si una frase es un palíndromo. Un palíndromo se
     * lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo, 1221 y 141
     * son palíndromos; 1234 y 839 no lo son. Anita lava la tina es un palíndromo.
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese cuantos numeros primos desea consultar");
        try {
            int a = Integer.parseInt(scan.nextLine());
            int b = 0;
            int c = 0;
            do {
                b++;
                c = 0;
                for (int x = 1; x <= b; x++) {
                    if (b % x == 0) {
                        c++;
                    }
                }

                if (c == 2) {
                    System.out.println("Es primo: " + b);
                    a--;
                }


            } while (a != 0);


        } catch (Exception e) {
            System.out.println();
            System.out.println("Se presento el siguiente error: " + e);
        }


    }
}
