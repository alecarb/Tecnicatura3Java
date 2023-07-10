
package excepciones;


public class OperacionException extends RuntimeException{
    //Hay que propagar un mensaje a la clase padre:
    //Constructor 
    public  OperacionException(String mensaje){
        super(mensaje);
    }
    
    
}
