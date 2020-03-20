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
public class Guitarra extends Instrumentos{
    public String tipo;
    public String marca;
    public int cantidadCuerdas;

    public Guitarra(String nombre,String clasificacion,String origen,String tamano,String tipo, String marca,int cantidadCuerdas) {
        super(nombre, clasificacion, origen, tamano);
        this.tipo = tipo;
        this.marca = marca;
        this.cantidadCuerdas = cantidadCuerdas;
    }
    
    public void mostrarGuitarra(){
        System.out.println
        ("Nombre: " + this.nombre +
        "\nClasificacion: " + this.clasificacion + 
        "\nOrigen: " + this.origen + 
        "\nTamaño: " + this.tamano + 
        "\nTipo: " + this.tipo + 
        "\nMarca: " + this.marca + 
        "\nCantidad cuerdas: " + this.cantidadCuerdas);
    }
    
    
}
