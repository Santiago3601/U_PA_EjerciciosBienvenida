package com.utadeo.ej_bienvenida;

import java.io.File;
import java.util.Scanner;

public class ejercicio_1 {
    /*
    *   Escribe un programa que le pide un número entero al usuario, y retorna par o impar
        según el tipo de número ingresado. Por ejemplo, si el input es 7, deber retornar
        “impar” y el número multiplicado por si mismo, y si es 4, retorna “par” con el número
        sumado por si mismo.
    *
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número por favor");
        try {
            int a = Integer.parseInt(scan.nextLine());
            if (a%2==0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
            System.out.println(a*a);

        }catch (Exception e){
            System.out.println();
            System.out.println("Se presento el siguiente error: " + e);
        }


    }
}
