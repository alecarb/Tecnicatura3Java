
package paquete2;


public class Clase4 {
    private String atributoPrivate = "atributo Privado";
    
    private Clase4(){
        System.out.println("Constructor privado");
    }
    
    //Creamos un constructor public para poder crear objetos
    public Clase4 (String argumento) { //aqui se puede llamar al constructor vacio
        this();
        System.out.println("Constructor publico");
    }
    
    //Metodo private
    private void metodoPrivado(){
        System.out.println("Metod privado");
    } 

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
}
