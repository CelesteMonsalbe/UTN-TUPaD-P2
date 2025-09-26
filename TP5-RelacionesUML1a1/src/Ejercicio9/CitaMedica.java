/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author facun
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;        // unidireccional
        this.profesional = profesional;  // unidireccional
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", paciente=" + paciente +
                ", profesional=" + profesional +
                '}';
    }
}
