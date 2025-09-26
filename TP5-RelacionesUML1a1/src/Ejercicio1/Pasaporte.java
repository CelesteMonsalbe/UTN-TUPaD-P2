/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author facun
 */
public class Pasaporte {
    private String numero;
private String fechaEmision;
// Composición: Foto creada dentro del pasaporte y es final
private final Foto foto;
// Asociación bidireccional: referencia al titular
private Titular titular;


public Pasaporte(String numero, String fechaEmision, String imagenBase64, String formato) {
this.numero = numero;
this.fechaEmision = fechaEmision;
// Creación de la Foto aquí: ciclo de vida ligada al Pasaporte
this.foto = new Foto(imagenBase64, formato);
}


public String getNumero() { return numero; }
public void setNumero(String numero) { this.numero = numero; }


public String getFechaEmision() { return fechaEmision; }
public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }


public Foto getFoto() { return foto; }


public Titular getTitular() { return titular; }


// Mantener asociación bidireccional consistente
public void setTitular(Titular titular) {
// Desvincular titular anterior si existe
if (this.titular != null && this.titular != titular) {
this.titular.removePasaporte(this);
}
this.titular = titular;
if (titular != null && titular.getPasaporte() != this) {
titular.setPasaporte(this);
}
}


@Override
public String toString() {
return "Pasaporte{numero='" + numero + "', fechaEmision='" + fechaEmision + "', foto=" + foto + ", titular=" + (titular != null ? titular.getNombre() : "null") + "}";
}
}
