
package paquete1;


public class Clase1 {
    public  String atributoPublic = "Valor atributo public";
    protected String atricutoProtected = "Ariel";
    
    public Clase1(){
        System.out.println("Constructor Publico");
    }
    protected Clase1 (String atributoPublico){
        System.out.println("Constructor protected");
    }
    
    public void metodoPublic(){
        System.out.println("Metodo Publico");
    }
    
    
}
