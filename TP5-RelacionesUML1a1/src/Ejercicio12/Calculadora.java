/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author facun
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        System.out.println("Calculando impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto a pagar: " + monto);
    }
}
