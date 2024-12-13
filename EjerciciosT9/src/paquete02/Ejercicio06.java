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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Definir los arreglos de productos y precios
        String[] productos = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precios = {1.5, 2.1, 2.3};
        int[] cantidades = new int[productos.length];
        double[] totalesPorProducto = new double[productos.length];
        double totalGeneral = 0;
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione el producto que desea comprar:");
            for (int i = 0; i < productos.length; i++) {
                System.out.printf("%d. %s ($%.2f)%n", i + 1, productos[i], precios[i]);
            }
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                int indiceProducto = opcion - 1;

                // Solicitar la cantidad de tazas
                System.out.printf("¿Cuántas tazas de %s desea comprar?%n", productos[indiceProducto]);
                int cantidad = scanner.nextInt();

                double totalPedido = cantidad * precios[indiceProducto];
                System.out.printf("El total por este pedido es: $%.2f%n", totalPedido);

                cantidades[indiceProducto] += cantidad;
                totalesPorProducto[indiceProducto] += totalPedido;
                totalGeneral += totalPedido;

            } else if (opcion == 4) {
                continuar = false;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        // Mostrar el resumen de compras
        System.out.println("\nEl usuario ha comprado:");
        for (int i = 0; i < productos.length; i++) {
            if (cantidades[i] > 0) {
                System.out.printf("  %s (%d t), valor a cancelar $%.2f%n", productos[i], cantidades[i], totalesPorProducto[i]);
            }
        }
        System.out.printf("Total a pagar: $%.2f%n", totalGeneral);


    }

}
