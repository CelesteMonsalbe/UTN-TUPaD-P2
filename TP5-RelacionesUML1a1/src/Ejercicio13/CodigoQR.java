/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author facun
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    // Getters y setters
    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }
    
    public void mostrarInfo() {
        System.out.println("Codigo QR creado para: " + usuario.getNombre());
        System.out.println("Contenido: " + valor);
    }
}
