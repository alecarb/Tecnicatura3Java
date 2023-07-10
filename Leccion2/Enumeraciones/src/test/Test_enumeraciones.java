
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;


public class Test_enumeraciones {
    public static void main(String[] args) {
        System.out.println("Continente de "+ Continentes.AMERICA);
        System.out.println("Nro de paises "+Continentes.AMERICA.getPaises());
        System.out.println("Nro de habitantes "+Continentes.AMERICA.getHabitantes());
        System.out.println("Continente de "+Continentes.AFRICA);
        System.out.println("Nro de paises "+Continentes.AFRICA.getPaises());
        System.out.println("Nro de habitantes "+Continentes.AFRICA.getHabitantes());
        System.out.println("Continente de "+Continentes.ASIA);
        System.out.println("Nro de paises "+Continentes.ASIA.getPaises());
        System.out.println("Nro de habitantes "+Continentes.ASIA.getHabitantes());
        System.out.println("Continente de "+Continentes.EUROPA);
        System.out.println("Nro de paises "+Continentes.EUROPA.getPaises());
        System.out.println("Nro de habitantes "+Continentes.EUROPA.getHabitantes());
        System.out.println("Continente de "+Continentes.OCEANIA);
        System.out.println("Nro de paises "+Continentes.OCEANIA.getPaises());
        System.out.println("Nro de habitantes "+Continentes.OCEANIA.getHabitantes());
        
        
        
        //System.out.println("Dia: "+Dias.LUNES);
        //indicarDiaSemana(Dias.LUNES); //Las enumeracione se tratan como cadenas. No se debe utilizar comillas, se accede por medioo del operador de punto.
    }
    
    public static void indicarDiaSemana(Dias dias){
        switch (dias){
            case LUNES :
                System.out.println("Primer dia de la semana ");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Elemento no valido");
                break;
            
        }
    }
    
}
