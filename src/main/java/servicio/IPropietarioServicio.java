/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Propietario;

/**
 *
 * @author USER
 */
public interface IPropietarioServicio {
    
    public Propietario crear(Propietario propietario);
    public List<Propietario> listar();
    public Propietario modificar(int codigo, Propietario propietario);
    public Propietario eliminar(int codigo);
    public int buscarPosicion(int codigo);
    
}
