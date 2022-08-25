/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fecha;

import java.text.SimpleDateFormat;

/**
 *
 * @author steffanyroa
 */
public class MetodoMain {

    public static void main(String[] args) {
        String numCadena = "";
        Fecha fecha = new Fecha(25, 8, 2022);
        numCadena += String.valueOf(fecha.getDia()+fecha.getMes()+fecha.getAño());
//        numCadena += "/" + String.valueOf(fecha.getMes());
//        numCadena += "/" + String.valueOf(fecha.getAño());

        System.out.println(numCadena);

    }

}
