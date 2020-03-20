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
public class Trompeta extends Instrumentos{
    public String tipo;
    public String marca;
    int cantidadPistones;

    public Trompeta(String nombre,String clasificacion,String origen,String tamano,String tipo, String marca,int cantidadPistones) {
        super(nombre, clasificacion, origen, tamano);
        this.tipo = tipo;
        this.marca = marca;
        this.cantidadPistones = cantidadPistones;
    }
    
    public void mostrarTrompeta(){
        System.out.println
        ("Nombre: " + this.nombre +
        "\nClasificacion: " + this.clasificacion + 
        "\nOrigen: " + this.origen + 
        "\nTamaño: " + this.tamano + 
        "\nTipo: " + this.tipo + 
        "\nMarca: " + this.marca + 
        "\nCantidad pistones: " + this.cantidadPistones);
    }
}
