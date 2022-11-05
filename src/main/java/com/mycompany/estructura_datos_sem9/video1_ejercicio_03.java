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
public class video1_ejercicio_03 {
    public static void main(String[] args) {
        List<video1_ejercicio_03_Persona> lis_persona = new ArrayList<>();
        
        /*video1_ejercicio_03_Persona per = new video1_ejercicio_03_Persona();
        
        per.setCodigo(1);
        per.setNombre("Walter");
        per.setApellido("Reyes");
        per.setEdad(25);
        
        lis_persona.add(per);
        
        System.out.println("Dato Lista: "+lis_persona.get(0).getNombre()+" "+lis_persona.get(0).getApellido());
        
        */

        for(int i = 0; i<10;i++){
            video1_ejercicio_03_Persona per = new video1_ejercicio_03_Persona();
            per.setCodigo(i);
            per.setNombre("Walter "+i);
            per.setApellido("Reyes "+i);
            per.setEdad(25+i);

            lis_persona.add(per);
        }
        
        System.out.println("Tamaño de lista: "+lis_persona.size());
        
        for(video1_ejercicio_03_Persona p: lis_persona){
            System.out.println("Codigo: "+p.getCodigo());
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Apellido: "+p.getApellido());
            System.out.println("Edad: "+p.getEdad());
            
            System.out.println("-----------------------");
        }
        
    }
}
