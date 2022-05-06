/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Auto;

/**
 *
 * @author USER
 */
public interface IAutoServicio {
    
   public Auto crear(Auto auto);
    public List<Auto> listar();
    public Auto modificar(int codigo, Auto auto);
    public Auto eliminar(int codigo);
    public int buscarPosicion(int codigo);
}
