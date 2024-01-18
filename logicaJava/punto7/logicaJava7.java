/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingi.logicajava.punto7;

import java.util.Scanner;

/**
 *
 * @author PIRA1
 */
public class logicaJava7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos del paciente
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cantidad de unidades de medicamento I: ");
        int unidadesI = scanner.nextInt();
        System.out.print("Ingrese la cantidad de unidades de medicamento J: ");
        int unidadesJ = scanner.nextInt();
        System.out.print("Ingrese la cantidad de unidades de medicamento K: ");
        int unidadesK = scanner.nextInt();

        // Precios de medicamentos
        int precioI = 20;
        int precioJ = 25;
        int precioK = 40;

        // Cálculos
        int totalUnidades = unidadesI + unidadesJ + unidadesK;
        int precioTotal = (unidadesI * precioI) + (unidadesJ * precioJ) + (unidadesK * precioK);
        String situacionPaciente = obtenerSituacionPaciente(totalUnidades);
        int ingresoTotal = precioTotal; // Suponiendo que el hospital no tiene otros ingresos.

        // Mostrar resultados
        System.out.println("Número total de unidades administradas al paciente: " + totalUnidades);
        System.out.println("Precio total a pagar por las unidades suministradas: $" + precioTotal);
        System.out.println("Situación del paciente: " + situacionPaciente);
        System.out.println("Ingreso total del hospital: $" + ingresoTotal);

        scanner.close();
    }

    private static String obtenerSituacionPaciente(int totalUnidades) {
        if (totalUnidades > 100) {
            return "Situación Crítica";
        } else if (totalUnidades >= 20 && totalUnidades <= 100) {
            return "Situación Normal";
        } else {
            return "Puede ser dado de alta";
        }
    }
}


