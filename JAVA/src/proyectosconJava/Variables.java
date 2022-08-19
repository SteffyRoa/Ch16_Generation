
package proyectosconJava;

/**
 *
 * @author steffanyroa
 */
public class Variables {

    public static void main(String[] args) {
     String nombre = "Hugo";
     String saludo= "Hola esto es ejemplo de variables";
     char espacio = '\u0064';
     
        System.out.println(saludo+ " " + espacio +" "+ nombre);
        System.out.println("char corresponde en byte"+ Character.BYTES);
        System.out.println("char corresponde en byte"+ Character.SIZE);
        System.out.println("char valor maximo"+ Character.MAX_VALUE);
         System.out.println("char valor minimo"+ Character.MIN_VALUE);
    }
    
}
