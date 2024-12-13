/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        System.out.println("Introduzca diez numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }
        double promedio = suma / numeros.length;
        System.out.println("\nResultados:");
        System.out.println("Promedio: " + promedio);
        for (int i = 0; i < numeros.length; i++) {
            double diferencia = numeros[i] - promedio;
            System.out.printf("Número: %.2f, Diferencia con el promedio: %.2f%n", numeros[i], diferencia);
        }
    }
}
