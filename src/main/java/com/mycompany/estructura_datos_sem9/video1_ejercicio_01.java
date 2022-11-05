/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructura_datos_sem9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class video1_ejercicio_01 {

    public static void main(String[] args) {
        List<String> lis_nombres = new ArrayList<>();
        
        lis_nombres.add("walter");
        lis_nombres.add("paul");
        lis_nombres.add("manuel");
        lis_nombres.add("sonia");
        
        System.out.println("Tamaño: "+lis_nombres.size());
        
        System.out.println("Dato posicion 0: "+lis_nombres.get(0));
        
        lis_nombres.remove(1);
        
        System.out.println("Tamaño: "+lis_nombres.size());
        
    }
}
