
package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    //Metodo insertar es abtracto y sin cuerpo
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
