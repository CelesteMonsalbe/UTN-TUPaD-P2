/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author facun
 */
public class Ejercicio14Main {
    public static void main(String[] args) {
        // Crear las instancias
        EditorVideo editor = new EditorVideo();
        Proyecto proyecto1 = new Proyecto("Vacaciones de Verano", 15);

        // Llamar al método que crea el nuevo objeto
        Render renderizado = editor.exportar("MP4", proyecto1);

        // Usar el objeto creado
        System.out.println("El proyecto '" + renderizado.getProyecto().getNombre() + "' fue renderizado a formato " + renderizado.getFormato());
    }
}
