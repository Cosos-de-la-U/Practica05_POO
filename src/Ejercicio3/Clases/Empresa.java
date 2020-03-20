/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Clases;

/**
 *
 * @author raulpenate
 */
public class Empresa {

    private String nombre;
    private String headquarters;
    private String CEO;
    private String mercado;

    public Empresa(String nombre, String headquarters, String CEO, String mercado) {
        this.nombre = nombre;
        this.headquarters = headquarters;
        this.CEO = CEO;
        this.mercado = mercado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getmercado() {
        return mercado;
    }

    public void setmercado(String mercado) {
        this.mercado = mercado;
    }

}
