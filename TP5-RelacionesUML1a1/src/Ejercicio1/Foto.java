/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author facun
 */
public class Foto {
    private String imagenBase64; // simplificación: guardamos la imagen como base64 o ruta
private String formato;


public Foto(String imagenBase64, String formato) {
this.imagenBase64 = imagenBase64;
this.formato = formato;
}


public String getImagenBase64() { return imagenBase64; }
public void setImagenBase64(String imagenBase64) { this.imagenBase64 = imagenBase64; }


public String getFormato() { return formato; }
public void setFormato(String formato) { this.formato = formato; }


@Override
public String toString() {
return "Foto{formato='" + formato + "', tamaño=" + (imagenBase64 != null ? imagenBase64.length() + " bytes" : "0") + "}";
}
}
