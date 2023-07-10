
package enumeraciones;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    ASIA(44, "1.1 billones"),
    EUROPA(46, "1.9 millones"),
    AMERICA(34, "9 millones" ),
    OCEANIA(14, "150.2 millones");
    
    //definimos un atributo para proporcionar la cantidad de paises que tiene cada continente
    private final int paises;
    private String habitantes;
    //definimos el constructuor para poder utilizar este argumento en cada uno de los elementos del enum

     Continentes(int paises, String habitantes) {
         this.paises = paises;        
         this.habitantes = habitantes;
    }
     
    //Metodo Get para recuperar el valor de argumento, ya que como se declara private esta encapsulado. 
     
     public int getPaises(){
         return this.paises;
     }
     
     public String getHabitantes(){
         return  this.habitantes;
     }

}