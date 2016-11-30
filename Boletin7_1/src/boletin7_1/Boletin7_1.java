
package boletin7_1;

public class Boletin7_1 {

     public static void main(String[] args) {
        
        Libros l1 = new Libros("F", "Juan", 2, 2);
        l1.devolucion();
        l1.prestamo();

        System.out.println(l1.toString());

    }
    
}
