/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);

        sc.close();
    }
}
