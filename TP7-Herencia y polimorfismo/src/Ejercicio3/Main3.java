package Ejercicio3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author facun
 */
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 150000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 1200));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " - Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
        }
    }
}
