/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author facun
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); // composición
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this); // bidireccional
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", placaMadre=" + placaMadre +
                ", propietario=" + (propietario != null ? propietario.getNombre() : "sin asignar") +
                '}';
    }
}
