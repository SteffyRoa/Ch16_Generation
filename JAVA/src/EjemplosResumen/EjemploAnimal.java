
package EjemplosResumen;

public class EjemploAnimal {
    public static void main(String[] args) {
        
        Animal miAnimal = new Animal("poodle","botana",5);
        
        
        System.out.println(miAnimal.getRaza());//obtengo la raza
        System.out.println(miAnimal.getNombre());//obtengo el nombre
        System.out.println(miAnimal.getEdad());//obtengo la edad
        
        System.out.println(miAnimal);//si imprimo el objeto completo
        
        
        //constructor vacio
        Animal animalito = new Animal();
        animalito.setRaza("chihuahua");//accediendo a raza y agregando
        animalito.setNombre("guayabita");
        animalito.setEdad(10);
        System.out.println("animalito es "+ animalito.getRaza());
        System.out.println("animalito es " +animalito.getNombre());
        System.out.println("animalito es " + animalito.getEdad());
        
        
        
        
    }
    
}
