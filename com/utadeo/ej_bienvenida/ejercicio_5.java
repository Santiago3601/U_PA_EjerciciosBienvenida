package com.utadeo.ej_bienvenida;

public class ejercicio_5 {
    /*
      Escribe un programa para organizar cualquier tipo de arreglo, número enteros,
      cadenas de caracteres o Strings.
     *
     */
    public static void main(String[] args) {
        int matriz[] = {10, 43, 1, 2, 22, 65, 765, 4, 4, 2, 22, 56};


        for (int x = 0; x < matriz.length; x++) {

            for (int y = 0; y < matriz.length - 1; y++) {
                int a = matriz[y];
                int b = matriz[y + 1];
                if (a > b) {

                    matriz[y] = b;
                    matriz[y + 1] = a;
                }
            }
        }
        for (int x = 0; x<matriz.length; x++){
            System.out.println(matriz[x]);
        }
    }
}