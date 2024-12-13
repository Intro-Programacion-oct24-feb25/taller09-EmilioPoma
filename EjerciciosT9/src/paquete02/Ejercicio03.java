/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
      

        double media = (double) suma / arreglo.length;

        int por_encima = 0;
        int por_debajo = 0;

        for (int num : arreglo) {
            if (num > media) {
                por_encima++;
            } else if (num < media) {
                por_debajo++;
            }
        }

        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos por encima de la media: " + por_encima);
        System.out.println("Elementos por debajo de la media: " + por_debajo);
    }
}
