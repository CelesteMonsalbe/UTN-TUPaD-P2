/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author facun
 */
public class Ejercicio10Main {
        public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 50000.0, "ABC123", "2025-09-25");
        Titular maria = new Titular("María Suárez", "99887766");
        cuenta.setTitular(maria);

        System.out.println(cuenta);
        System.out.println(maria);
    }
}
