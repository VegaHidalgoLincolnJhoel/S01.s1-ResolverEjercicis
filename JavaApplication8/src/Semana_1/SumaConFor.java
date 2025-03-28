/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_1;

public class SumaConFor {
    public static void main(String[] args) {
        int numero = 350; 
        int suma = 0;
        
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma desde 1 hasta " + numero + " es: " + suma);
    }
}
