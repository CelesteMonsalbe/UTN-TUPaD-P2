/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author facun
 */
public class Ejercicio1Main {
    public static void main(String[] args) {

    Titular titular = new Titular("Ana Pérez", "12345678");
    Pasaporte pasaporte = new Pasaporte("PA-0001", "2025-01-15", "imagen_bytes_base64", "jpg");
    // establecer asociación bidireccional
    pasaporte.setTitular(titular);
    System.out.println(pasaporte);
    System.out.println(titular);
    }
}
