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
public class Semana {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        byte diaSemana =sc.nextByte();
        switch (diaSemana){
            case 1:
                System.out.println("Se escribio uno");
                break;
                case 2:
                System.out.println("Se escribio dos");
                break;
                case 3:
                System.out.println("Se escribio tres");
                break;
                case 4:
                System.out.println("Se escribio cuatro");
                break;
                case 5:
                System.out.println("Se escribio cinco");
                break;
                
        }
    }
    
}
