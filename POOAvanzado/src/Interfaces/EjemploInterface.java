/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author steffanyroa
 */
public class EjemploInterface {
    public static void main(String[] args) {
        System.out.println(""+Interface.conv);//primera forma
        //en interface no se instancia, se llama directamente
        
        
//segunda forma de llamar a la que esta implementando a la interfaz
System.out.println(""+Prueba.conv);

//METODO
//primero interface nombre = new nombre donde esta implementada
Interface ts = new Prueba();//objeto de iNTERFACE solo llama lo de interface
ts.metodo1(0);

System.out.println("ts.metodo2--->steffany"+ts.metodo2("hola"));
Prueba p = new Prueba(); //objeto de prueba y llama a todo lo que contega prueba
p.metodoPropio();
        
Interface s1 = new Prueba();
s1.metodo1(0);//lo imprime porque esta el system.out.print
        System.out.println(s1.metodo2("roa"));//este necesariamente necesita el system ya que su metodo
        //solo es return y necesito imprimirlo

        
        
        
        
    }
}
