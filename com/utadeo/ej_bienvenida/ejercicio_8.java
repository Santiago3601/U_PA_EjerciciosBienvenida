package com.utadeo.ej_bienvenida;

import java.util.Scanner;

public class ejercicio_8 {
    /*
     * Escribe un programa que computa un String al revés, y le agregue la palabra “lol”.
     * Por ejemplo, “arepa” se vuelve “aperalol”.
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el string a modificar");
        String a = scan.nextLine();
        String b="";


        for(int x = 0; x< a.length(); x++){
            b= a.charAt(x) + b;
        }
        System.out.println(b+"lol");;

    }
}
