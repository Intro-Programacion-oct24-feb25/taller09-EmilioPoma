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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] ventas = new double [5];
        String[] dias =  {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String cadena_final = "Reporte";
        
        for (int i =0; i < ventas.length; i++){
                System.out.println("Ingrese el valor de ventas del dia " + dias[i]);
                ventas[i] = entrada.nextDouble();
                cadena_final = String.format("%s\n-%s $%.2f", cadena_final,dias[i], ventas[i]);
        }
        System.out.println(cadena_final);
        
        
        
        
      

    }

}
