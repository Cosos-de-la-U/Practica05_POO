/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio2.Clases.*;

/**
 *
 * @author raulpenate
 */
public class Main {
    
    public static void main(String[] args) {
        //Crea 1 presidente
        Presidente presidente = new Presidente();
        presidente.mostrarDatosPresidente();
        //Crea 2 gerentes
        for (int i = 0; i < 2; i++) {
            Gerente gerente = new Gerente();
            gerente.mostrarDatosGerente(i);
            //Crea 3 empleados por cada Gerente, en total 6
            for (int j = 0; j < 3; j++) {
                Empleado empleado = new Empleado();
                empleado.mostrarDatosEmpleado(i);
            }
        }
    }
}
