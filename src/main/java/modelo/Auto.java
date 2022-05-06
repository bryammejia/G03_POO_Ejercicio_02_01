/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Auto {
    
    private int codigo;
    private String marca;
    private int year;
    private String placa;
    private Propietario propietario;

    public Auto(int codigo, String marca, int year, String placa) {
        this.codigo = codigo;
        this.marca = marca;
        this.year = year;
        this.placa = placa;
    }

    public String obtenerProvincia(){
        var retorno = "IBD";
            var primerCaracterPlaca = this.placa.charAt(0);
            switch(primerCaracterPlaca)
            {
                case 'A':
                    retorno = "Azuay";
                    break;
                case 'B':
                    retorno = "Bolivar";
                    break;
                case 'C':
                    retorno = "Carchi";
                    break;   
                case 'U':
                    retorno = "Cañar";
                    break;
                case 'G':
                    retorno = "Guayas";
                    break;
                case 'P':
                    retorno = "Pichincha";
                    break;
                default:
                    retorno = "Provincia no disponible";
            }
           return retorno; 
    }
    
    public int calcularYears(){
        var retorno = 100000;
                retorno = 2022 - year;
            return retorno;
    }
    
    public Auto(int codigo, String marca, int year, String placa, Propietario propietario) {
        this.codigo = codigo;
        this.marca = marca;
        this.year = year;
        this.placa = placa;
        this.propietario = propietario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Auto{" + "codigo=" + codigo + ", marca=" + marca + ", year=" 
                + year + ", placa=" + placa + ", propietario=" + propietario + '}';
    }
    
    
}
