/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author facun
 */
public class Ejercicio5Main {
     public static void main(String[] args) {
        Computadora pc = new Computadora("Dell", "SN123", "X570", "AMD");
        Propietario juan = new Propietario("Juan Pérez", "12345678");
        pc.setPropietario(juan);

        System.out.println(pc);
        System.out.println(juan);
    }
}
