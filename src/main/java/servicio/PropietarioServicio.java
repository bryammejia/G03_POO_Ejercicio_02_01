/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Propietario;

/**
 *
 * @author USER
 */
public class PropietarioServicio {
    
    private final List<Propietario> propietarioList = new ArrayList<>();
    
     public Propietario crear(Propietario propietario){
        this.propietarioList.add(propietario);
        return propietario;
    }
     
     public List<Propietario> listar(){   
        return this.propietarioList;
        
    }   
     
    public Propietario modificar(Propietario propietario){
        this.propietarioList.add(propietario);
        return propietario;
    }
    
    public Propietario eliminar(Propietario propietario){
        this.propietarioList.add(propietario);
        return propietario;
    }

}
