package Ejercicio4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author facun
 */
public class Main4 {
    public static void main(String[] args) {
        Animal[] animales = { new Perro(), new Gato(), new Vaca() };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); 
            System.out.println();
        }
    }
}
