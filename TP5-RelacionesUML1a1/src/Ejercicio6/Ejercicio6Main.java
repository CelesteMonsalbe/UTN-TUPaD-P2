/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author facun
 */
public class Ejercicio6Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de las clases "partes" o "independientes".
        Cliente cliente1 = new Cliente("Laura", "3456-7890");
        Mesa mesa1 = new Mesa(5, 4);

        // 2. Crear la instancia de la clase Reserva y pasarle las "partes".
        Reserva reserva1 = new Reserva("25/09/2025", "20:30", cliente1, mesa1);

        // 3. Probar las relaciones unidireccionales.
        System.out.println("Reserva para el cliente: " + reserva1.getCliente().getNombre());
        System.out.println("Reserva para la mesa numero: " + reserva1.getMesa().getNumero());
        // No es posible acceder a la reserva desde las clases Cliente o Mesa.
        // Por ejemplo: System.out.println(cliente1.getReserva()); // Esto daría un error
    }
}
