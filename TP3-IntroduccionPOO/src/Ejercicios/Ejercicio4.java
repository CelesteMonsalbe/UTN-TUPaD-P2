/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author facun
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2); // id=1, edad=2 años
        Gallina g2 = new Gallina(2, 1); // id=2, edad=1 año

        // Simular acciones
        System.out.println("Granja Digital:\n");

        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estados finales
        System.out.println("\nEstado final de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

// Clase Gallina
class Gallina {
    private int idGallina;
    private int edad;          
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    // Mostrar estado de la gallina
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " años | Huevos puestos: " + huevosPuestos);
    }
}

