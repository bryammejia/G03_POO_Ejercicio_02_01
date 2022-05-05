/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Auto;

/**
 *
 * @author USER
 */
public class AutoServicio {
    
    private final List<Auto> autoList = new ArrayList<>();
    
    public Auto crear(Auto auto){
        this.autoList.add(auto);
        return auto;
    }
     
     public List<Auto> listar(){   
        return this.autoList;
        
    }   
     
    public Auto modificar(Auto auto){
        this.autoList.add(auto);
        return auto;
    }
    
    public Auto eliminar(Auto auto){
        this.autoList.add(auto);
        return auto;
    }
}
