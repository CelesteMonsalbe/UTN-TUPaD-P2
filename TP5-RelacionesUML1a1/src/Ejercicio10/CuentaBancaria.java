/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author facun
 */
public class CuentaBancaria {
     private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion); // composición
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuenta(this); // bidireccional
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", claveSeguridad=" + claveSeguridad +
                ", titular=" + (titular != null ? titular.getNombre() : "sin titular") +
                '}';
    }
}
