/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingi.logicajava.punto2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PIRA1
 */
public class LogicaJava2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el número de filas (m) y columnas (n)
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        // Crear la matriz
        char[][] matriz = new char[m][n];

        // Leer caracteres y almacenar en la matriz
        System.out.println("Ingrese los caracteres para la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.next().charAt(0);
            }
        }

        // Ordenar la matriz
        ordenarMatriz(matriz);

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void ordenarMatriz(char[][] matriz) {
        // Concatenar todos los caracteres diferentes de " " en un solo arreglo
        char[] caracteresNoEspacio = new char[matriz.length * matriz[0].length];
        int index = 0;

        for (char[] fila : matriz) {
            for (char c : fila) {
                if (c != ' ') {
                    caracteresNoEspacio[index++] = c;
                }
            }
        }

        // Ordenar el arreglo de caracteres
        Arrays.sort(caracteresNoEspacio);

        // Volver a llenar la matriz con los caracteres ordenados
        index = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != ' ') {
                    matriz[i][j] = caracteresNoEspacio[index++];
                }
            }
        }
    }

}
