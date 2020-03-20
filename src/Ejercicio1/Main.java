/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import Ejercicio1.Clases.*;
/**
 *
 * @author raulpenate
 */
public class Main {
    
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("Guitarra", "Cuerda pulsada", "Turco", "4/4", "Flamento", "Palmer", 6);
        guitarra.mostrarGuitarra();
        System.out.println("------------------------------------");
        Piano piano = new Piano("Guitarra", "Cuerda percutida", "Italiano", "59\"x40\"x6'7\"", "Clásico", "Yamaha", 88);
        piano.mostrarPiano();
        System.out.println("------------------------------------");
        Trompeta trompeta = new Trompeta("Trompeta  ", "Viento con boquilla", "Egipto", "6.5x22x15 inches", "Estudiante", "Jean Paul USA", 3);
        trompeta.mostrarTrompeta();
        System.out.println("------------------------------------");
    }
}
