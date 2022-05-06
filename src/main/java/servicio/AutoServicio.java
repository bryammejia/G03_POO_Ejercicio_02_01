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
public class AutoServicio implements IAutoServicio{
    
    private final List<Auto> autoList = new ArrayList<>();

    @Override
    public Auto crear(Auto auto) {
        this.autoList.add(auto);
        return auto;
     }

    @Override
    public List<Auto> listar() {
        return this.autoList;
   }

    @Override
    public Auto modificar(int codigo, Auto auto) {
        this.autoList.set(this.buscarPosicion(codigo), auto);
        return auto;
        
     }

    @Override
    public Auto eliminar(int codigo) {
        var auto = this.autoList.get(this.buscarPosicion(codigo));
        this.autoList.remove(this.buscarPosicion(codigo));
        return auto;
    }

    

    @Override
    public int buscarPosicion(int codigo) {
        var posicion=-1;
        var i=0;
        for(var auxAuto:this.autoList){
            if(auxAuto.getCodigo()==codigo){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
    
    
}
