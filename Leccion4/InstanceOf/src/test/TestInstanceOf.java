
package test;


import domain.*;


public class TestInstanceOf {
    public static void main (String[] args) {
        Empleado empleado1  = new Empleado("Juan ", 10000);
        determinarTipo(empleado1);
      
        empleado1 = new Gerente("Jose ", 5000, "Sistemas");
        //determinarTipo(empleado1);
     
    }
  
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado; //conversion de tipo, conocida como "casting"
            //((Gerente) empleado).getDepartamento(); lo tira solo el ide al hacer empleado.getDepartamento() Ojo que hay que cambiar lo que se imprime: va empleado no va gerente.
            //gerente.getDepartamento();
            System.out.println(gerente.getDepartamento()); 
            
        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
           // Gerente gerente = (Gerente)empleado; 
           // System.out.println(gerente.getDepartamento()); //para ver el error de ClassCastxception comentar la linea 14 y descomentar la linea 11
            
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Objet");
        }
        
    }
    
}
