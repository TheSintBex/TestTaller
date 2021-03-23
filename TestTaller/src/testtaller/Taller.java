/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtaller;

import java.util.ArrayList;

/**
 * Esta clase define el Taller, que nos permite obtener un control de mecánicos y dependientes.
 * @author Diurno
 */
public class Taller {
    
   private ArrayList <Mecanico> mecanicos;
   private ArrayList <Dependiente> dependientes;
   private String nombre;
   
   /**
   * 
   *@param nombre Define el nombre del objeto Taller;
   */
   
   public Taller (String nombre){
       this.nombre = nombre;
       this.mecanicos = new ArrayList();
       this.dependientes = new ArrayList();
   }
   
   /**
   * Método que inserta mecánicos en el ArrayList mecanicos.
   * @param mec Parámetro para pasarle un objeto mecánico al método y que permite insertarlo.
   */
   public void insertaMecanico(Mecanico mec) {
       if(mecanicos.contains(mec)){
           System.out.println("Mecánico ya en la flota");
       } else {
         mecanicos.add(mec); 
       }
      
   }
   
   /**
   * Método que inserta dependientes en el ArrayList dependientes.
   * @param dep Parámetro para pasarle un objeto dependiente al método y que permite añadirlo.
   */
   public void insertaDependiente (Dependiente dep){
       if(dependientes.contains(dep)){
           System.out.println("Dependiente ya en la flota");
       } else {
           dependientes.add(dep);
       }
   }
   
   /**
   * Método que elimina mecánicos del ArrayList mecanicos.
   * @param mec Parámetro para pasarle un objeto mecánico al método y eliminarlo.
   */
   public void despideMecanico (Mecanico mec){
       if(mecanicos.contains(mec)){
           mecanicos.remove(mec);
       } else {
           System.out.println("El mecánico no está en la flota");
       }
   }
   
   /**
   * Método que elimina dependientes en el ArrayList dependientes.
   * @param dep Parámetro para pasarle un objeto dependiente al método y eliminarlo.
   */
   public void despideDependiente (Dependiente dep){
       if(dependientes.contains(dep)){
           dependientes.remove(dep);
       } else {
           System.out.println("El dependiente no está en la flota");
       }
   }
   
   /**
   * Método que devuelve el número de mecánicos.
   *@return Devuelve el número total de mecánicos de los que consta el taller.
   */
   public int numMecanicos (){
       return mecanicos.size();
   }
   
   /**
   * Método que devuelve el número de dependientes.
   *@return Devuelve el número total de dependientes de los que consta el taller.
   */
   public int numDependientes(){
       return dependientes.size();
   }
   
   /**
   * Método que devuelve la suma de mecánicos y dependientes.
   *@return Devuelve el número total de mecánicos y dependientes de los que consta el taller.
   */
   public int numEmpleadosTotal(){
       return mecanicos.size()+dependientes.size();
   }
   
   /**
   *Método que devuelve la información de los mecánicos.
   *@return Devuelve los datos de la información de los mecánicos.
   */
   public String toStringMec (){
       String salida  = "";
    for (Mecanico mecanico : mecanicos) {
        salida+=mecanico.toString()+", ";
    }
    return salida;
   }
   
   /**
   * Método que devuelve la información de los dependientes.
   *@return Devuelve los datos de la información de los dependientes.
   */
   public String toStringDep (){
       String salida  = "";
       for (Dependiente dependiente : dependientes) {
           salida+=dependiente.toString()+", ";
       }
       return salida;
        
    }
    
   }

   
   
    

