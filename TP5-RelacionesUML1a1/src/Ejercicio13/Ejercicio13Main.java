/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author facun
 */
public class Ejercicio13Main {
    public static void main(String[] args) {
        // 1. Crear las instancias necesarias.
        GeneradorQR generador = new GeneradorQR();
        Usuario usuario1 = new Usuario("Lucia", "lucia@mail.com");

        // 2. Llamar al método que crea el nuevo objeto.
        CodigoQR codigoGenerado = generador.generar("https://www.google.com", usuario1);

        // 3. Usar el objeto creado.
        System.out.println("El codigo QR generado tiene el valor: " + codigoGenerado.getValor());
        System.out.println("Fue generado para el usuario: " + codigoGenerado.getUsuario().getNombre());
    }
}
