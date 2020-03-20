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
public class Piano extends Instrumentos{
    public String tipo;
    public String marca;
    public int cantidadTeclas;

    public Piano(String nombre,String clasificacion,String origen,String tamano,String tipo, String marca,int cantidadTeclas) {
        super(nombre, clasificacion, origen, tamano);
        this.tipo = tipo;
        this.marca = marca;
        this.cantidadTeclas = cantidadTeclas;
    }
    
    public void mostrarPiano(){
        System.out.println
        ("Nombre: " + this.nombre +
        "\nClasificacion: " + this.clasificacion + 
        "\nOrigen: " + this.origen + 
        "\nTamaño: " + this.tamano + 
        "\nTipo: " + this.tipo + 
        "\nMarca: " + this.marca + 
        "\nCantidad Teclas: " + cantidadTeclas);
    }
}
