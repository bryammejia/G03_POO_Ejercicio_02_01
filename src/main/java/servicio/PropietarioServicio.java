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
public class PropietarioServicio implements IPropietarioServicio {

    private final List<Propietario> propietarioList = new ArrayList<>();
    
    @Override
    public Propietario crear(Propietario propietario) {
        this.propietarioList.add(propietario);
        return propietario;
    }

    @Override
    public List<Propietario> listar() {
    return this.propietarioList;
    }

    @Override
    public Propietario modificar(int codigo, Propietario propietario) {
    this.propietarioList.set(this.buscarPosicion(codigo), propietario);
    return propietario;
    }

    @Override
    public Propietario eliminar(int codigo) {
    var propietario = this.propietarioList.get(this.buscarPosicion(codigo));
    this.propietarioList.remove(this.buscarPosicion(codigo));
    return propietario;
    }

    @Override
    public int buscarPosicion(int codigo) {
    var posicion=-1;
        var i=0;
        for(var auxPropietario:this.propietarioList){
            if(auxPropietario.getCodigo()==codigo){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
        
    }
    
    
}
