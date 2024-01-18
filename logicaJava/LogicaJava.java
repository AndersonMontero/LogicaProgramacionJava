/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package programmingi.logicajava;

import java.util.Scanner;

/**
 *
 * @author PIRA1
 */
public class LogicaJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);

        // Obtener el número de renglones y columnas
        System.out.print("Ingrese el número de renglones: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int n = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[m][n];

        // Leer la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular la suma de los elementos de cada columna
        int[] sumaColumnas = new int[n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        // Imprimir la suma de los elementos de cada columna
        System.out.println("Suma de los elementos de cada columna:");
        for (int j = 0; j < n; j++) {
            System.out.println("Columna " + (j) + ": " + sumaColumnas[j]);
        }

        scanner.close();           
    }
}
