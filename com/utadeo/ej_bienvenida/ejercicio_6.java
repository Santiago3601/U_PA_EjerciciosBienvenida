package com.utadeo.ej_bienvenida;

import java.util.Scanner;

public class ejercicio_6 {
    /*
     * El número 381.654.729 tiene una propiedad muy curiosa que no cumple ningún otro
     * número. Si lo miras con cuidado es probable que te des cuenta de que tiene los nueve
     * dígitos entre el 1 y el 9 y que no repite ninguno de ellos. Sin embargo, eso no es lo
     * único especial que tiene (hay muchos otros números así).
     * Lo que realmente lo hace singular es que, además de lo anterior, es divisible por 9; si se le
     * quita el último dígito, queda un número divisible por 8; si se le vuelve a quitar el último
     * dígito, queda un número divisible por 7; y así continuamente hasta llegar a un número de
     * un único dígito que, naturalmente, es divisible por 1:
     *
     * 381.654.729 = 9 × 42.406.081
     *  38.165.472 = 8 × 4.770.684
     *   3.816.547 = 7 × 545.221
     *     381.654 = 6 × 63.609
     *      38.165 = 5 × 7.633
     *       3.816 = 4 × 954
     *         381 = 3 × 127
     *          38 = 2 × 19
     *           3 = 1 × 3
     *
     * Esta última peculiaridad es lo que en matemáticas se conoce como un número polidivisible,
     * que puede definirse de la siguiente forma: un número es polidivisible si es divisible por
     * su longitud y, además, si se le quita el último dígito queda un número que es a su vez
     * polidivisible.
     *
     * Existen otros números polidivisibles como el 102 o el 9.876. Pero su cantidad es limitada:
     * hay un total de 20.456 números polidivisibles distintos, el mayor de los cuales tiene 25
     * dígitos. Decir si un número ingresado es polidivisible o no
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Ingrese el número a consultar");
            int a = Integer.parseInt(scan.nextLine());
            String b =  String.valueOf(a);
            int c =b.length();
            boolean flag = true;

            do {
                double x =(double) (Double.valueOf(b.substring(0,c))/c);
                if(x%1 !=0){
                    flag=false;
                }
                c--;
            }while(c>0);

            System.out.println(flag);



        } catch (Exception e) {
            System.out.println();
            System.out.println("Se presento el siguiente error: " + e);
        }


    }
}
