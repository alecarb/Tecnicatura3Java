
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clasen envolvente de tipo primitivos"
            int - la clase envolvente es Integer
            long = Long
            double = Double
            bollean = Boolean
            byte = Byte
            char = Char
            short = Short
        */
        int enteroPrimitivo = 10; //Tipo primitivo
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);
        Integer entero = 10;//Tipo object con la clase Interger
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
