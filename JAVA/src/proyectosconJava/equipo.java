/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosconJava;

import java.util.Scanner;

/**
 *
 * @author steffanyroa
 */
public class equipo {
    public static void main(String[] args) {
        int rows = 0;
        int pro;
        System.out.println("Ingresa un numero");
       
        
        Scanner sc = new Scanner (System.in);
        rows = sc.nextInt();
        
          
    
           
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
    
}
        
        
        System.out.println("SEGUNDO");
        
    for(int i=1;i<rows;i++) {	
			for(int j=1;j<i+1;j++) {
				pro=i*j;
				System.out.print("*");		
				}
			    System.out.print("");
 
       
 
            // pasar a la siguiente fila
            System.out.print(System.lineSeparator());
}
         System.out.println("Que lugar te gusta  derecha o izquierda  ");
         String lado = "";
         
         
         if(lado=="derecha"){
             
         }else{
             
         }
         
         
}
}