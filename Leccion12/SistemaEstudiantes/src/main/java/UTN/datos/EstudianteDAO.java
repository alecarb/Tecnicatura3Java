package UTN.datos;

import UTN.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static UTN.conexion.Conexion.getConnetion;

public class EstudianteDAO {
    //Metodo listar
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        //Creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //introduce la sentnecia sql de la BD
        ResultSet rs; // Obtenemos el resultado de la BD
        //Creamos un objeto de tipo conexion
        Connection con = getConnetion();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }//Fin finally
        }
        return estudiantes;
    }//Fin metodo listar

    //Metodo find by id
    public boolean buscarEstudiantePorId(Estudiante estudiante) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnetion();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getNString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getNString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //Se encontro un registro
            }//Fin if
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar estudiante: " + e.getMessage());
        }//fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar conexion: " + e.getMessage());
            }//fin catch
        }//Fin finally
        return false;
    }//Fin metodo find by id

    //Metodo Agregar estudiante
    public boolean agregarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnetion();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre()); //se necesita pasarle en que columna va a ir, luego el como se llama. Todo eso se setea.
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute(); //execute es solo para insertar. Por eso no se usa el executeQuery que es para leer
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrio un error al agregar el estudiante: " + e.getMessage());
        }//Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }//fin finally
        return false;
    }

    //Metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnetion();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try {
            //le pasamos todos los argumentos en orden, como el objeto sql q contiene la consulta
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute(); //se hace em commit
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrio un error al modificar el estudiante: " + e.getMessage());
        }//Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error de conexion: " + e.getMessage());
            }
        }//Fin finally
        return false;
    }//Fin metodo modificarEstudiante

    //Metodo eliminarEstudiante
    public boolean eliminarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnetion();
        String sql = "DELETE FROM estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Aqui se hacen las pruebas de los metodos

        var estudianteDao = new EstudianteDAO(); //variable global para que las pruebas puedan utilizar el objeto estudianteDao

        //Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); //Funcion lambda para imprimir

/*
        //buscar por id
        var estudiante1 = new Estudiante(2); //usamos el constructor que trabaja con solo el id
        System.out.println("Estudiantes antes de la busqueda :" +estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado)
            System.out.println("Estudiante encontrado: "+estudiante1);
        else
            System.out.println("No se encontro el estudiante: "+estudiante1.getIdEstudiante());

*/
/*
        //Agregar  estudiante
        //usamos el constructor que pasa los valores menos el id
        var nuevoEstudiante = new Estudiante("Amalia", "Flores","6443288", "mflores@mail.com");
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        //comprobacion
        if(agregado)
            System.out.println("Estudiante agregado: "+nuevoEstudiante);
        else
            System.out.println("No se a agregado estudiante: "+nuevoEstudiante );
*/
/*

    //Modificar estudiante
        //usamos el constructor para modificar estudiante
        var estudianteModificado = new Estudiante(1, "Jua Carlos", "Juarez","44433222", "juan@mail.com");
        var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        //comprobacion
        if (modificado)
            System.out.println("Estudiante modificado: "+estudianteModificado);
        else
            System.out.println("El estudiante no se modifico: "+estudianteModificado);

    }
*/

/*
        //Eliminar un estudiante con id
        var estudianteEliminar = new Estudiante(7);
        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminar);
        //comprobacion
        if (eliminado)
            System.out.println("Estudiante eliminado: " + estudianteEliminar);
        else
            System.out.println("No se elimino estudiante: " + estudianteEliminar);
*/

    }
}