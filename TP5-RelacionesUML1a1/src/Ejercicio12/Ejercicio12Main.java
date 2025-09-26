/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author facun
 */
public class Ejercicio12Main {
    public static void main(String[] args) {
        // 1. Crear las instancias.
        Contribuyente contribuyente1 = new Contribuyente("Natalia", "20-98765432-1");
        Impuesto impuesto1 = new Impuesto(1500.50, contribuyente1);
        Calculadora calculadora = new Calculadora();

        // 2. Llamar al método que usa el objeto.
        calculadora.calcular(impuesto1);
    }
}
