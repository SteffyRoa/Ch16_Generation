/*
Una interfaz es una coleccion de metodos abstractos (sin implementar) y de valores constante que puede realizar un objeto determinado
*/
package Interfaces;
/*Clase abstracta donde los metodos no se van a implementar
objetos diferentes pero solo se necesita que se implemente la interfaz
Una interface es como una clase abstracta pero no permite que ninguno de sus metodos este implementado
Atributos constantes y de la clase los atributos en una interfaz son por defecto constantes
*/

public interface Interface {
   //metodos al servicio de esta interface
    
    int conv= 8;
    void metodo1 (int x);
    
    String metodo2(String s);
    
    
}



class Prueba implements Interface, Interface2{

    @Override
    public void metodo1(int x) {
         }

    
    @Override
    public String metodo2(String s) {
         
         return "este metodo es s-->"+s;
         
         }
    public void metodoPropio(){
        System.out.println("Hola soy metodo de la clase prueba");
    }

    @Override
    public void metodo01() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String metodo02() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
//metodo implementdo de una interfaz -implements
//

