/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingi.logicajava.punto6;

import java.util.Scanner;

/**
 *
 * @author PIRA1
 */
public class logicaJava6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar si el número es positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            // Mostrar los divisores del número
            System.out.println("Divisores de " + numero + ":");
            mostrarDivisores(numero);
        }

        scanner.close();
    }
    private static void mostrarDivisores(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
