
package test;

import static aritmetica.Aritmetica.division; //Importamos el metodo 
import excepciones.OperacionException;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0); //aqui hacemos uso del metodo importado.
        }catch(OperacionException e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println("");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out); //se conoce como la pila de excepciones
            System.out.println(e.getMessage()); // getMessage() trae desde mensaje de Aritmetica
        }
        finally{
            System.out.println("Se reviso la division entre cero"); //el finally siempre se ejecuta
        }
        
        System.out.println("\nLa variable de resultado tiene como valor: "+resultado);
    }
    
}
