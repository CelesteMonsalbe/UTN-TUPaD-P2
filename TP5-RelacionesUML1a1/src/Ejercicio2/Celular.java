/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author facun
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Relación de agregación
    private Usuario usuario; // Relación de asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        // Se inyecta una instancia existente de Bateria
        this.bateria = bateria;
        this.usuario = usuario;
        // Establecer la relación bidireccional
        if (usuario != null) {
            usuario.setCelular(this);
        }
    }

    // Getters y setters
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    } 
}