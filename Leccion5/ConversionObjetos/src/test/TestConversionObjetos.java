
package test;

import domain.*;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a metodos Escritor
        //empleado.getTipoEscritura(); No se puede llamar al metodo directamente desde la clase padre.
        //Pero si hacinedo un casteo:
        //Downcasting: convierte una referencia padre a un tipo hija. Asi se puede acceder al metodo declarado en la 
        //clase padre y heredado por la clase hija.
        //((Escritor)empleado).getTipoEscritura(); // Tenemos 2 opciones: esta es una
        
        Escritor escritor = (Escritor)empleado; //Esta es la segunda opcion
        escritor.getTipoEscritura();
        
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
  
}
