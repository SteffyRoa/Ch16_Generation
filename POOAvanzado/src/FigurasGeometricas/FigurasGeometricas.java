/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas;


abstract public class FigurasGeometricas {
    
    private String nombre;
    
    public abstract float area();
    
    @Override
    public String toString(){
        
        return nombre;
    }
    
}
