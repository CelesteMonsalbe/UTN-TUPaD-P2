package Ejercicio3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author facun
 */
class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double precioHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double precioHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * precioHora;
    }
}
