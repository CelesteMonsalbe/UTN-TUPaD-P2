/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author facun
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Apolo", 50);

        System.out.println("Estado inicial:");
        nave.mostrarEstado();

        // Intentar avanzar sin recargar
        System.out.println("\nIntentando avanzar 100 km sin recargar...");
        nave.avanzar(100);

        // Recargar combustible
        System.out.println("\nRecargando combustible...");
        nave.recargarCombustible(30);

        // Avanzar correctamente
        System.out.println("\nAvanzando 50 km...");
        nave.avanzar(50);

        // Mostrar estado final
        System.out.println("\nEstado final de la nave:");
        nave.mostrarEstado();
    }
}

// Clase NaveEspacial
class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAX = 100; // máximo de combustible
    private int distanciaRecorrida;

    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, CAPACIDAD_MAX); // no exceder capacidad
        this.distanciaRecorrida = 0;
    }

    // Método para despegar
    public void despegar() {
        if (combustible > 0) {
            System.out.println("La nave " + nombre + " ha despegado!");
        } else {
            System.out.println("No hay combustible para despegar.");
        }
    }

    // Método para avanzar 
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            distanciaRecorrida += distancia;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= CAPACIDAD_MAX) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        } else {
            System.out.println("No se puede recargar tanto, se alcanzaría el límite.");
        }
    }

    // Mostrar estado actual
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre +
                " | Combustible: " + combustible +
                " | Distancia recorrida: " + distanciaRecorrida + " km");
    }
}

