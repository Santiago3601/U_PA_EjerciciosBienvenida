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

        try {

            System.out.println("Ingrese el string a modificar");
            String a = scan.nextLine();
            String b="";

            a = a.replaceAll("\\s+","");

            for(int x = 0; x< a.length(); x++){
                b= a.charAt(x) + b;
            }

            if(a.equals(b)){
                System.out.println("Palindromo");
            }else{
                System.out.println("No es palindromo");
            }


        } catch (Exception e) {
            System.out.println();
            System.out.println("Se presento el siguiente error: " + e);
        }


    }
}
