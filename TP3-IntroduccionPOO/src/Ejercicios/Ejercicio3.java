/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author facun
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        // Mostrar información inicial
        System.out.println("Información inicial:");
        libro.mostrarInfo();

        // Intentar cambiar el año a un valor inválido
        System.out.println("\nIntentando cambiar el año a 3025...");
        libro.setAnioPublicacion(3025);  // inválido

        // Intentar cambiar el año a un valor válido
        System.out.println("\nCambiando el año a 1950...");
        libro.setAnioPublicacion(1950);  // válido

        // Mostrar información final
        System.out.println("\nInformación final:");
        libro.mostrarInfo();
    }
}

// Clase Libro con encapsulamiento
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // usa el setter con validación
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("❌ Año de publicación inválido: " + anioPublicacion);
        }
    }

    // Método para mostrar info del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}

