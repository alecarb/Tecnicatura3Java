
package mundoPC;

import ar.com.system2023.mundopc.*;



public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13 );
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora  computadoraHP = new Computadora("Computadora HP", monitorHP, ratonHP, tecladoHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("ComputadoraGamer", monitorGamer, ratonGamer, tecladoGamer);
        
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraGamer);
        orden2.mostrarOrden();
        
        
        
        
    }
    
}
