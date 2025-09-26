/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author facun
 */
public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando el proyecto '" + proyecto.getNombre() + "'...");
        Render renderizado = new Render(formato, proyecto);
        System.out.println("Renderizado completado en formato " + formato);
        return renderizado;
    }
}
