/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author facun
 */
public class Ejercicio8Main {
     public static void main(String[] args) {
        // 1. Crear la instancia de la clase Usuario (la clase "independiente").
        Usuario usuario1 = new Usuario("Pablo", "pablo@mail.com");

        // 2. Crear la instancia de la clase Documento, que internamente creará la FirmaDigital.
        Documento documento1 = new Documento("Reporte Anual", "Contenido del documento...", "HASH123ABC", "25/09/2025", usuario1);

        // 3. Probar las relaciones.
        System.out.println("Documento: " + documento1.getTitulo());
        System.out.println("La firma fue creada por el usuario: " + documento1.getFirma().getUsuario().getNombre());
        System.out.println("Codigo hash de la firma: " + documento1.getFirma().getCodigoHash());
    }
}
