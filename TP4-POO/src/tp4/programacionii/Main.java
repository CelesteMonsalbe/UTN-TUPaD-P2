/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.programacionii;

/**
 *
 * @author facun
 */
public class Main {
    public static void main(String[] args) {

        // Crear empleados con ambos constructores
        Empleado e1 = new Empleado(101, "Ana Perez", "Gerente", 3000);
        Empleado e2 = new Empleado("Juan Lopez", "Analista");
        Empleado e3 = new Empleado("Lucía Gomez", "Programador");

        // Aplicar métodos sobrecargados actualizarSalario
        e1.actualizarSalario(10);    // +10% de aumento
        e2.actualizarSalario(200);   // +200 de aumento fijo
        e3.actualizarSalario(5);     // +5% de aumento

        // Imprimir información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

