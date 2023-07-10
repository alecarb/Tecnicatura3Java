
package paquete1;

//le sacamos la palabra public, queda una clae default o paquete. Esto hace que la clase solo puedas er utilizada dentro del mismo paquete
class Clase2{
    String atributoDefault = "Valor de atributo default";

   // public Clase2() {
    //    System.out.println("Constructor Default");
    //}
    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = "+ this.atributoDefault);
        this.metodoDefault();
    }
    
    void metodoDefault(){
        System.out.println("Metodo default");
    }
    
}
