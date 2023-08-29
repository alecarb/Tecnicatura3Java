package UTN.presentacion;

import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        var estudianteDao =  new EstudianteDAO(); //esta instancia debe hacerse 1 vez
        while (!salir){
            try{
                mostrarmenu(); //Mostramos el menu
                //El metodo ejecutarOpcion  devolvera un bolleano
                salir = ejecutarOpciones(consola, estudianteDao);
            } catch (Exception e){
                System.out.println("ocurrio un error al ejecutar la oeracion: "+e.getMessage());
            }
        }//Fin while
    }//Fin main

    private static void mostrarmenu(){
        System.out.println("""
                ***** Sistema de Estudiantes *****
                1. Listar Estudiantes
                2. Buscar Estudiantes
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                Elige una opción:
                """);
    }

    //Metodo para ejecutar las opciones, va a regresar un valor booleano, ya que es el que
    //puede modificar el valor de la variable salir, si es V terminael ciclo while
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch(opcion){
            case 1 ->{
                //Listar estudiantes
                System.out.println("Listado de Estudiantes...");
                //no muestra la informacion, solo recipera la info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes(); //recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println); //para imprimir la lista
            }//Fin caso 1
            case 2 ->{ //Buscar estudiante por id
                System.out.println("Introduce el id_estudiante a buscar: ");
                var idEstudiante = Integer.parseInt((consola.nextLine()));
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if (encontrado)
                    System.out.println("Estudiante encontrado: "+estudiante);
                else
                    System.out.println("Estudiante NO encintrado: "+estudiante);

            }//Fin caso 2
            case 3 ->{//Agregar estudiante
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //creamos el objeto donde se guardan los atributos del nuevo estudiante, sin el id porque eso lo hace otro constructor.
                var estudiante = new Estudiante(nombre,apellido,telefono,email);
                //Lo agregamos con el metodo agregarEstudiante de DAO
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                //comprobacion
                if(agregado)
                    System.out.println("Estudiante agragado: "+estudiante);
                else
                    System.out.println("Estudiante NO agregado: "+estudiante);

            }//Fin caso 3
            case 4 ->{//Modificar estudiante
                System.out.println("Ingrese el ID del estudiante a modificar: ");
                //Id del objeto a modificar
                var idEstudiante = Integer.parseInt(consola.nextLine());
                //Lo que se va a solicitar para modificar
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crea el objeto estudiante a modificar
                var estudiante = new Estudiante(idEstudiante,nombre,apellido,telefono,email);
                //modificamos el objeto con los nuevos valores que se pasaron en el objeto estudiante creado una linea mas arriba
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                //comprobacion
                if(modificado)
                    System.out.println("Estudiante modificado: "+estudiante);
                else
                    System.out.println("Estudiante NO modificado: "+estudiante);
            }//Fin caso 3
            case 5->{//Eliminar estudiante
                System.out.println("Ingrese el ID del estudiante a eliminar: ");
                //Id del obejto a eliminar
                var idEstudiante = Integer.parseInt(consola.nextLine());
                //cramos el objeto con el constructor consobrecarga, le pasamos el id
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                //comprobacion
                if(eliminado)
                    System.out.println("Estudiante eliminado: "+estudiante);
                else
                    System.out.println("Estudiante NO eliminado: "+estudiante);

            }//Fin caso 5
            case 6 ->{//Salir
                System.out.println("Hasta pronto...");
                salir = true;
            }//Fin caso 6
            default -> System.out.println("Opcion no reconocida, ingrese otra opcion");
        }//Fin switch

    }

}//Fin clase