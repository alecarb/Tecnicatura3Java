    
package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 2,5,7);
        imprimirNumeros(6,3,2,1);
        variosParametros("Ale", 3,3,3);
        
    }
    
    private static void variosParametros(String nombre, int ...numeros){ //aqui se puede notar que el argumento variable va ultimo cuando hay varios paramentros
        System.out.println("Nombre: "+nombre );
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int ...numeros){ //(int ...numeros) se va a tratar igual que un arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
            
        }
    }
}
