/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author facun
 */
public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        // Se crea la instancia de CodigoQR dentro del método
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Generando código QR...");
        return codigo;
    }
}
