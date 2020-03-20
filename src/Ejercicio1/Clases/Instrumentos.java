/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Clases;

/**
 *
 * @author raulpenate
 */
public class Instrumentos {
    public String nombre;
    public String clasificacion;
    public String origen;
    public String tamano;

    public Instrumentos(String nombre, String clasificacion, String origen, String tamano) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.origen = origen;
        this.tamano = tamano;
    }    
    
    public void mostrarInstrumento(){
        System.out.println
        ("/nNombre: " + this.nombre +
        "/nClasificacion: " + this.clasificacion + 
        "/nOrigen: " + this.origen + 
        "/nTamaño: " + this.tamano);
    }
   
}
