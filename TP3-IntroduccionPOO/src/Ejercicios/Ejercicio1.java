/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author facun
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Ana", "Perez", "Matematica", 75.5);

        est.mostrarInfo();

        est.subirCalificacion(5);
        est.mostrarInfo();

        est.bajarCalificacion(20);
        est.mostrarInfo();

        est.subirCalificacion(50);  
        est.mostrarInfo();

        est.bajarCalificacion(200); 
        est.mostrarInfo();
    }
}

class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion); 
    }

    public void mostrarInfo() {
        System.out.printf("Estudiante: %s %s , Curso: %s , Calificacion: %.2f%n",
                          nombre, apellido, curso, calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos < 0) {
            System.out.println("Error: los puntos a subir no pueden ser negativos.");
            return;
        }
        calificacion += puntos;
        if (calificacion > 100) calificacion = 100; 
        System.out.println("Se subio la calificacion.");
    }

    public void bajarCalificacion(double puntos) {
        if (puntos < 0) {
            System.out.println("Error: los puntos a bajar no pueden ser negativos.");
            return;
        }
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0; 
        System.out.println("Se bajo la calificacion.");
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0) this.calificacion = 0;
        else if (calificacion > 100) this.calificacion = 100;
        else this.calificacion = calificacion;
    }
}
