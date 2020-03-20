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
public class SectorSecundario extends Empresa {

    private String grado;
    private String tamaño;
    private String formaJurdica;

    public SectorSecundario(String nombre, String headquarters, String CEO, String mercado, String grado, String tamaño, String formaJuridica) {
        super(nombre, headquarters, CEO, mercado);
        this.grado = grado;
        this.tamaño = tamaño;
        this.formaJurdica = formaJuridica;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getFormaJurdica() {
        return formaJurdica;
    }

    public void setFormaJurdica(String formaJurdica) {
        this.formaJurdica = formaJurdica;
    }

}
