/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author facun
 */
class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        miMascota.nombre = "Luna";
        miMascota.especie = "Gato";
        miMascota.edad = 2;

        miMascota.mostrarInfo();

        miMascota.cumplirAnios();

        miMascota.mostrarInfo();
    }
}

