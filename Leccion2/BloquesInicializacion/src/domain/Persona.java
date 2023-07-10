
package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static {//Bloque de inicializacion estatico
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
       // idPersona = 10; No es un atributo estatico, por eso tenemos error
    }
    
    {//Bloque de inicializacion NO estatico (Contexto Dinamico)
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++; //Incrementa el atributo
        
    }
    
    //Los bloques de inicializacion de ejecutan antes del constructor de nuestra clase
    
    public Persona(){
        System.out.println("Esta es la ejecuacion del constructor");
    }
    
    public int getIdePersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
