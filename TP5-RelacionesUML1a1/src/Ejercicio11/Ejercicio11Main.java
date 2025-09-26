/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author facun
 */
public class Ejercicio11Main {
     public static void main(String[] args) {
        // 1. Crear las instancias de las clases necesarias.
        Artista artista1 = new Artista("Queen", "Rock");
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", artista1);
        Reproductor reproductor = new Reproductor();

        // 2. Llamar al método que causa la dependencia.
        reproductor.reproducir(cancion1);
    }
}
