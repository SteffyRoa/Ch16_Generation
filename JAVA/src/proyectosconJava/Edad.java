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
public class Edad {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Escribe tu edad: ");
           int edad = sc.nextInt();
           sc.close();
           if(edad >= 18){
               System.out.println("Mayor de edad");
           }else{
               System.out.println("Menor de edad");
           }
           
           //Operador ternario/ operador elvvis
           
           //poner la condicion dentro los parentesis luego signo de interrogacion y luego los punitos para definir
           //() ? : ;
           String resultado=(edad>=18)? "Eres mayor de edad":"Eres menor de edad";
           System.out.println("resultado"+resultado);
           
           
           
           
         
       }
    
}
