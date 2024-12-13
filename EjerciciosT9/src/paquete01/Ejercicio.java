/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {
        public static void main(String[] args) {
    Scanner marcas = new Scanner(System.in);

        String[] marca;
        int NumElementos;
        String cadena = "";

        System.out.println("Ingrese el número de marcas a ingresar:");
        NumElementos = marcas.nextInt();
        marcas.nextLine();
        marca = new String[NumElementos];

        for (int i = 0; i < marca.length; i++) {

            System.out.println("Ingrese el nombre de la marca:");
            String nombreMarca = marcas.nextLine();
            char inicial = nombreMarca.charAt(0);
            String letra = String.valueOf(inicial).toUpperCase();

            if (letra.equals("A") || letra.equals("C") || letra.equals("T")) {
                System.out.println("Las marcas ingresadas no son válidas por su inicial. Evite marcas iniciadas en A, C, o T.");
                i--; // Retrocede el índice para permitir un reintento

            } else {
                marca[i] = nombreMarca;
                cadena = String.format("%s%s\n", cadena, marca[i]);
            }
        }

        System.out.printf("Las marcas ingresadas son:\n%s", cadena);
    }
    
}
