/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author facun
 */
public class Titular {
    private String nombre;
    private String dni;
// referenciar su pasaporte (asociación bidireccional)
private Pasaporte pasaporte;


public Titular(String nombre, String dni) {
this.nombre = nombre;
this.dni = dni;
}


public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }


public String getDni() { return dni; }
public void setDni(String dni) { this.dni = dni; }


public Pasaporte getPasaporte() { return pasaporte; }


// Mantener asociación bidireccional consistente
public void setPasaporte(Pasaporte pasaporte) {
if (this.pasaporte != null && this.pasaporte != pasaporte) {
this.pasaporte.setTitular(null);
}
this.pasaporte = pasaporte;
if (pasaporte != null && pasaporte.getTitular() != this) {
pasaporte.setTitular(this);
}
}


// método auxiliar para que Pasaporte pueda desvincular sin recursión infinita
protected void removePasaporte(Pasaporte p) {
if (this.pasaporte == p) this.pasaporte = null;
}


@Override
public String toString() {
return "Titular{nombre='" + nombre + "', dni='" + dni + "', pasaporte=" + (pasaporte != null ? pasaporte.getNumero() : "null") + "}";
}
}
