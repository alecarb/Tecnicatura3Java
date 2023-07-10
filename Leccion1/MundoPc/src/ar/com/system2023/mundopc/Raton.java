
package ar.com.system2023.mundopc;


public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones; 
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones; 
    }
    /*
    La clase Raton tiene un constructor que recibe dos parámetros: tipoEntrada y marca. 
    El constructor llama al constructor de la superclase DispositivoEntrada mediante 
    la instrucción super(tipoEntrada, marca) para inicializar los atributos heredados. 
    Luego, inicializa el atributo idRaton con el valor de ++Raton.contadorRatones, 
    lo que significa que cada vez que se crea una nueva instancia de la clase Raton, 
    el contador estático contadorRatones se incrementa en uno 
    y ese valor se usa para inicializar el atributo idRaton.
    */

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';
    }
    /*
    La clase Raton hereda de la clase DispositivoEntrada, 
    por lo que todas las instancias de la clase Raton tienen los mismos atributos de la clase DispositivoEntrada. 
    Para incluir estos atributos heredados en la cadena de salida del método toString() de la clase Raton, 
    se puede llamar al método toString() de la superclase mediante la instrucción super.toString().
    De esta manera, el resultado final del método toString() de la clase Raton incluirá tanto los atributos heredados
    de la clase DispositivoEntrada como los atributos propios de la clase Raton.
    */
    
}
