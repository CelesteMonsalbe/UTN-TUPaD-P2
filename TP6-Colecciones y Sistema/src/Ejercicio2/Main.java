/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author facun
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A2", "Julio Cortázar", "Argentina");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");

        // Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN004", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN005", "Paula", 1994, autor3);

        System.out.println("\n Listado de libros:");
        biblioteca.listarLibros();

        System.out.println("\n Buscar libro por ISBN 'ISBN003':");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n Libros publicados en 1985:");
        biblioteca.filtrarLibrosPorAnio(1985);

        System.out.println("\n️ Eliminar libro ISBN002:");
        biblioteca.eliminarLibro("ISBN002");

        System.out.println("\n Libros restantes:");
        biblioteca.listarLibros();

        System.out.println("\n Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        System.out.println("\n️ Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}

