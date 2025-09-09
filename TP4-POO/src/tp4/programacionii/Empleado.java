/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.programacionii;

/**
 *
 * @author facun
 */
public class Empleado {

    // Atributos privados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;
    private static int contadorId = 1; // para generar IDs automáticos

        // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto, id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1500.0; // salario por defecto
        totalEmpleados++;
    }

        // Aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    // Aumento por cantidad fija
    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }

        public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

        @Override
    public String toString() {
        return "Empleado[ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

        public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
