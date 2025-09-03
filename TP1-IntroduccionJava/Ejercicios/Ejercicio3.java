/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosusuario;

import java.util.Scanner;

/**
 *
 * @author facun
 */

//Ejercicio 3
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        scanner.close();
    }
    
}
