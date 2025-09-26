/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author facun
 */
public class Ejercicio9Main {
    public static void main(String[] args) {
        Paciente pac = new Paciente("Carlos Díaz", "OSDE");
        Profesional doc = new Profesional("Dra. López", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-01", "09:30", pac, doc);

        System.out.println(cita);
    }
}
