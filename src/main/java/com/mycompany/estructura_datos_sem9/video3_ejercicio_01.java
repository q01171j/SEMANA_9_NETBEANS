/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class video3_ejercicio_01 {
    ArrayList<Double> listaNumero;
    
    public static void main(String[] args){
        video3_ejercicio_01 lista = new video3_ejercicio_01();
        lista.listaNumero = new ArrayList();
        lista.leerOpcion();
    }
    
    public void leerOpcion(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\nLista de Numeros");
            System.out.println("[1] Agregar");
            System.out.println("[2] Buscar");
            System.out.println("[3] Modificar elemento");
            System.out.println("[4] Eliminar elemento");
            System.out.println("[5] Insertar elemento");
            System.out.println("[6] Mostrar elementos");
            System.out.println("[7] Salir\n");
            System.out.print("Ingrese opcion (1-7): ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                    break;
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarLista();
                    break;
                case 7:
            }
        }while(opcion != 7);
    }
    
    public void ingresarValor(){
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.print("Ingrese un Valor: ");
        valor = sc.nextDouble();
        listaNumero.add(valor);
    }
    
    public void buscarValor(){
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = sc.nextDouble();
        indice = listaNumero.indexOf(valor);
        if(indice != -1){
            System.out.println("Dato se encuentra en posicion: "+indice);
        }else{
            System.out.println("Dato no se encuentra");
        }
    }
    
    public void modificarValor(){
        Scanner sc = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.print("Valor a modificar: ");
        valor = sc.nextDouble();
        indice = listaNumero.indexOf(valor);
        if(indice != -1){
            System.out.print("Nuevo Valor: ");
            nuevoValor = sc.nextDouble();
            listaNumero.set(indice, nuevoValor);
        }else{
            System.out.println("Dato no se encuentra.");
        }
    }
    
    public void eliminarValor(){
        Scanner sc = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.print("Valor a eliminar: ");
        valor = sc.nextDouble();
        indice = listaNumero.indexOf(valor);
        if(indice != -1){
            listaNumero.remove(indice);
            System.out.print("Dato eliminado");
        }else{
            System.out.println("Dato no se encuentra.");
        }
    }
    
    public void insertarValor(){
        Scanner sc = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.print("Valor a insertar: ");
        valor = sc.nextDouble();
        System.out.print("Posicion donde desea insertar: ");
        indice = sc.nextInt();
        listaNumero.add(indice, valor);
    }
    
    public void mostrarLista(){
        if(!listaNumero.isEmpty()){
            System.out.println("Elementos de la lista:");
            for(int i = 0; i<listaNumero.size();i++){
                System.out.println(listaNumero.get(i));
            }
        }else{
            System.out.println("No existen valores en la lista");
        }
    }
}
