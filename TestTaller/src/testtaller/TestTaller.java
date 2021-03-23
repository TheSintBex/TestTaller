
package testtaller;

/**
 * 
 * Esta clase contiene el método Main donde se instancian diferentes objetos Mecanico y Dependiente, y se usan los métodos al completo de la clase Taller
 */
public class TestTaller {

    public static void main(String[] args) {
      Mecanico m1, m2, m3, m4, m5, m6;
      Dependiente d1, d2, d3, d4, d5, d6;
      
      m1 = new Mecanico("Paco", "12", "Chapa");
      m2 = new Mecanico("Ana", "1", "Cambio de Ruedas");
      m3 = new Mecanico("Juan", "56", "Correas");
      m4 = new Mecanico("Juana", "23", "Cambios de aceite");
      m5 = new Mecanico("Dylan", "25", "Suspensiones");
      m6 = new Mecanico("Francisca", "255", "Alineacion");
      
      d1 = new Dependiente("Jose", "Sanchez", "1222");
      d2 = new Dependiente("Cristina", "Gonzalez", "69088");
      d3 = new Dependiente("Federico", "Suarez", "122233");
      d4 = new Dependiente("Miguel","Quesada", "12222");
      d5 = new Dependiente("Victoria", "Garcia", "131313");
      d6 = new Dependiente("Sara", "Bracero", "1010101");
         
        
      Taller t1 = new Taller("Taller Luna");
      
      t1.insertaDependiente(d2);
      t1.insertaDependiente(d4);
      
      t1.insertaMecanico(m6);
      t1.insertaMecanico(m1);
      
      System.out.println(t1.numDependientes());
      System.out.println(t1.numMecanicos());
      System.out.println(t1.numEmpleadosTotal());  
      
      System.out.println(t1.toStringDep());
      System.out.println(t1.toStringMec());
      
      
              
      Taller t2 = new Taller("Taller Fran");
      
      t2.insertaDependiente(d2);
      t2.insertaDependiente(d4);
      t2.insertaDependiente(d1);
      
      t2.insertaMecanico(m6);
      t2.insertaMecanico(m1);
      
      t2.insertaMecanico(m2);
      t2.insertaMecanico(m3);
      
      System.out.println(t2.numDependientes());
      System.out.println(t2.numMecanicos());
      System.out.println(t2.numEmpleadosTotal());  
      
      System.out.println(t2.toStringDep());
      System.out.println(t2.toStringMec());
      
        
    }

}
