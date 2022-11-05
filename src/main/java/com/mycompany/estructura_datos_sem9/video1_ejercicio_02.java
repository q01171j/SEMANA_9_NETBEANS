/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class video1_ejercicio_02 {
    public static void main(String[] args) {
        List<String> lis_nombres = new ArrayList<>();
        
        lis_nombres.add("walter");
        lis_nombres.add("paul");
        lis_nombres.add("manuel");
        lis_nombres.add("sonia");
        
        for(String n : lis_nombres) {
            System.out.println("Nombre: "+n);
        }
        
    }
}
