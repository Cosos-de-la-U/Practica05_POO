/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.Clases.*;

/**
 *
 * @author raulpenate
 */
public class Main {

    public static void main(String[] args) {
        SectorPrimario sectorprimario = new SectorPrimario("Maseca", "San Pedro García, México", "Roberto Gonzales ", "Agrícultura y Comida", "Privada", "Grande", "Socios Mercantiles");
        System.out.println("Datos de empresa Sector Primario:\n"
                + sectorprimario.getNombre()
                + "\n"
                + sectorprimario.getHeadquarters()
                + "\n"
                + sectorprimario.getCEO()
                + "\n"
                + sectorprimario.getmercado()
                + "\n"
                + sectorprimario.getGrado()
                + "\n"
                + sectorprimario.getTamaño()
                + "\n"
                + sectorprimario.getFormaJurdica());
        System.out.println("-------------------------------");
        SectorSecundario sectorsecundario = new SectorSecundario("Grupo ACS", "Madrid, España", "Florentino Perez", "Construcción", "Privada", "Grande", "Socios Mercantiles");

        System.out.println("Datos de empresa Sector Secundario:\n"
                + sectorsecundario.getNombre()
                + "\n"
                + sectorsecundario.getHeadquarters()
                + "\n"
                + sectorsecundario.getCEO()
                + "\n"
                + sectorsecundario.getmercado()
                + "\n"
                + sectorsecundario.getGrado()
                + "\n"
                + sectorsecundario.getTamaño()
                + "\n"
                + sectorsecundario.getFormaJurdica());
        System.out.println("-------------------------------");
        SectorTerciario sectorterciario = new SectorTerciario("AT&T", "Texas Estados Unidos", "Randall L. Stephenson", "Telecomunicaciones", "Privada", "Grande", "Socios Mercantiles");
        System.out.println("Datos de empresa Sector Terciario:\n"
                + sectorterciario.getNombre()
                + "\n"
                + sectorterciario.getHeadquarters()
                + "\n"
                + sectorterciario.getCEO()
                + "\n"
                + sectorterciario.getmercado()
                + "\n"
                + sectorterciario.getGrado()
                + "\n"
                + sectorterciario.getTamaño()
                + "\n"
                + sectorterciario.getFormaJurdica());

    }
}
