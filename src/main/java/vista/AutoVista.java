/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.AutoControl;
import modelo.Auto;
import modelo.Propietario;

/**
 *
 * @author USER
 */
public class AutoVista {

    public static void main(String[] args) {
        var autoControl = new AutoControl();
        autoControl.crear(01, "CHEVROLET", 2015, "ABC-1234", 001, "Andres", "Mejia", "0106513153", "0988094043");
        autoControl.crear(02, "FORD", 2018, "BEF-5678", 002, "Jonathan", "Coronel", "0105514322", "0987654321");
        autoControl.crear(03, "AUDI", 2017, "CFG-7896", 003, "Marco", "Garces", "0106542376", "0964632464");

        var auto1 = new Auto(01, "CHEVROLET", 2015, "ABC-1234");
        var auto2 = new Auto(02, "FORD", 2018, "BEF-5678");
        var auto3 = new Auto(03, "CHEVROLET", 2017, "CFG-7896");

        System.out.println("-----LISTA DE AUTOS-----");

        for (Auto auto : autoControl.listar()) {
            System.out.println(auto.toString());
        }
        System.out.println("La placa: " + auto1.getPlaca() + " es de la Provincia: " + auto1.obtenerProvincia());
        System.out.println("La placa: " + auto2.getPlaca() + " es de la Provincia: " + auto2.obtenerProvincia());
        System.out.println("La placa: " + auto3.getPlaca() + " es de la Provincia: " + auto3.obtenerProvincia());
        
        System.out.println("La edad del vehiculo es de: "+auto1.calcularYears()+" años");
        System.out.println("La edad del vehiculo es de: "+auto2.calcularYears()+" años");
        System.out.println("La edad del vehiculo es de: "+auto3.calcularYears()+" años");

        System.out.println();

        autoControl.eliminar(01);

        System.out.println("-----LISTA ELIMINAR-----");
        for (Auto auto : autoControl.listar()) {
            System.out.println(auto.toString());
        }
        System.out.println();

        System.out.println("-----LISTA MODIFICAR-----");
        var propietario = new Propietario(002, "Bryam", "Morocho", "0105107338", "0985226741");
        var nuevoAuto = new Auto(02, "TESLA", 2020, "ADC-3456");
        
         autoControl.modificar(02, nuevoAuto);

        for (Auto auto : autoControl.listar()) {
            System.out.println(auto.toString());
        }

    }

}
