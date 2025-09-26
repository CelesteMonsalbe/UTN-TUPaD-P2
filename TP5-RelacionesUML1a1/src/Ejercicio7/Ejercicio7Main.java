/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author facun
 */
public class Ejercicio7Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR987");
        Vehiculo auto = new Vehiculo("ABC123", "Ford Fiesta", motor);
        Conductor ana = new Conductor("Ana Gómez", "LIC5678");
        auto.setConductor(ana);

        System.out.println(auto);
        System.out.println(ana);
    }
}
