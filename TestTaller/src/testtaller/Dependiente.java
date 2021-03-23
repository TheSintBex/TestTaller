/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtaller;

/**
 * Esta clase define un objeto Dependiente que tiene un nombre, un apellido y un DNI.
 * 
 */
public class Dependiente {
    
    private String nombre;
    private String apellido;
    private String dni;
    
    /**
    *@param nombre Define el nombre del objeto Dependiente.
    *@param apellido Define el apellido del objeto Dependiente.
    *@param dni Define el dni del objeto Dependiente.
    */
    
    
    public Dependiente (String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
    }

    /**
     * 
     * @return La información del dependiente en forma de cadena de caracteres.
     */
    @Override
    public String toString() {
        return "Dependiente: " + "nombre: " + nombre + ", apellidos: " + apellido + ", dni: " + dni + ". ";
    }
    
    
    
}
