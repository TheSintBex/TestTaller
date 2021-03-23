/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtaller;

/**
 * Esta clase define un objeto Mecánico que tiene un nombre, número de empleado y una especialidad.
 * 
 */
public class Mecanico {
    
    private String nombre;
    private String numEmp;
    private String especialidad;
    
    /**
    *@param nombre Define el nombre del objeto Mecanico.
    *@param numEmp Define el número de empleado del objeto Mecanico.
    *@param especialidad Define la especialidad del objeto Mecanico.
    */
    public Mecanico (String nombre, String numEmp, String especialidad){
        this.nombre = nombre;
        this.numEmp = numEmp;
        this.especialidad = especialidad;
    }
    
    /**
     * 
     * @return La información del mecánico en forma de cadena de caracteres.
     */
    @Override
    public String toString() {
        return "Mecanico:" + "nombre: " + nombre + ", numEmp: " + numEmp + ", especialidad: " + especialidad +". ";
    }
    
    
    
}
