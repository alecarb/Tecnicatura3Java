
package domain;

import java.io.Serializable;
//Debe implementar la clase Serealizable: esto es obligatorio.

public class Persona implements Serializable{
    //atributos privados es obligatorio
    private String nombre;
    private String apellido;
    
    //Constructor vacio: esto es obligatorio
    
    public Persona(){
        
    }
    //Constructor con parametros no es obligatorio
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;    
    }

   //Getter and Setter con encapsulamiento

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Se puede agregar como complemeto un toString, equals, has

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
}
