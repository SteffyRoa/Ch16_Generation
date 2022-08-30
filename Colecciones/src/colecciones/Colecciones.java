/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 *
 * @author steffanyroa
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> cursos = new ArrayList <>();
       
        cursos.add("Java 8");
        cursos.add("Python");
        cursos.add("PHP");
        cursos.add("Javascript");
        cursos.add("HTML");
        cursos.add("CSS");
        
        Collections.sort(cursos);
        for(String lista: cursos){
            System.out.println(""+lista);
        }

    }
    
}
//Para crear un comparator creamos otra clase 
/*class Comparator implements Comparator <String>{

    @Override
    public int compare(String objeto1, String objeto2) {
       if(objeto1.length()>objeto2.length()){
          return 1;
           
       }else if (objeto1.length()<objeto2.length()){
           return -1;
           
       
      
    }
        return 0;
    
}
}*/