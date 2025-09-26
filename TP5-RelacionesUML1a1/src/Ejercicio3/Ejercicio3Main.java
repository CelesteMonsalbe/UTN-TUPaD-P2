/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author facun
 */
public class Ejercicio3Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de las clases "partes" (Autor y Editorial).
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial1 = new Editorial("Sudamericana", "Av. de Mayo 560");

        // 2. Crear el objeto principal (Libro) y pasarle las partes.
        Libro libro1 = new Libro("Cien años de soledad", "978-84-376-0494-7", autor1, editorial1);

        // 3. Probar la relación. La clase Libro conoce a las otras, pero no al revés.
        System.out.println("Título del libro: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor().getNombre());
        System.out.println("Editorial: " + libro1.getEditorial().getNombre());
    }
}
