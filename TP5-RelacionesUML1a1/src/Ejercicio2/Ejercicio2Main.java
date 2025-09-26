/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author facun
 */
public class Ejercicio2Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de las clases "partes" o "independientes"
        Bateria bateria1 = new Bateria("Li-Ion", 5000);
        Usuario usuario1 = new Usuario("Ana Gomez", "87654321");

        // 2. Crear la instancia de la clase "todo" (Celular) y pasarle las "partes" creadas.
        Celular celular1 = new Celular("IMEI12345", "Samsung", "Galaxy S22", bateria1, usuario1);

        // 3. Probar las relaciones.
        System.out.println("El celular " + celular1.getMarca() + " pertenece a " + celular1.getUsuario().getNombre());
        System.out.println("Usa una batería modelo: " + celular1.getBateria().getModelo());
    }
}
