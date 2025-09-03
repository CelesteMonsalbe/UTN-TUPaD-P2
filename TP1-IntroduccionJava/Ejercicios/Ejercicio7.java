/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        //Division con enteros
        int divisionEntera = num1 / num2;

        //Division con decimales
        double divisionDecimal = (double) num1 / num2; 

        // Mostrar resultados
        System.out.println("Resultado como int (division entera): " + divisionEntera);
        System.out.println("Resultado como double (division con decimales): " + divisionDecimal);

        scanner.close();
    }
    
}
