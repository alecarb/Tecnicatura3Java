
package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{
    public Clase3(){
        super("protected");
        this.atricutoProtected = "Accedemos desde la clase hija";
        System.out.println("Atibuto protected = " + atricutoProtected);
        this.atributoPublic = "es totalmente publico";
    }
}
