/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author facun
 */
public class Ejercicio4Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Cliente y Banco.
        Cliente cliente1 = new Cliente("Maria Lopez", "98765432");
        Banco banco1 = new Banco("Banco Central", "30-12345678-9");

        // 2. Crear la TarjetaDeCredito, que automáticamente establece la relación bidireccional con Cliente.
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", cliente1, banco1);

        // 3. Probar la relación en ambos sentidos.
        System.out.println("Tarjeta: " + tarjeta1.getNumero() + " pertenece al cliente " + tarjeta1.getCliente().getNombre());
        System.out.println("Cliente: " + cliente1.getNombre() + " tiene la tarjeta " + cliente1.getTarjeta().getNumero());
    }
}
