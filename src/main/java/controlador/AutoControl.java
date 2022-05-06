/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Auto;
import modelo.Propietario;
import servicio.AutoServicio;

/**
 *
 * @author USER
 */
public class AutoControl {

    public AutoServicio autoServicio = new AutoServicio();

    public Auto crear(int codigo, String marca, int year, String placa, int codigoP, String nombreP, String apellidoP, String cedulaP, String celularP) {
        var propietario = new Propietario(codigoP, nombreP, apellidoP, cedulaP, celularP);
        var auto = new Auto(codigo, marca, year, placa, propietario);
        this.autoServicio.crear(auto);
        return auto;
    }
    
    public Auto eliminar(int codigo){
        return this.autoServicio.eliminar(codigo);
        
    }
    
    public Auto modificar(int codigo, Auto auto){
        return this.autoServicio.modificar(codigo, auto);
        
    }
    
    public List<Auto> listar(){
        return this.autoServicio.listar();
    }

}
