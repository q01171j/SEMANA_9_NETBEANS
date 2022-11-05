/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem9;

/**
 *
 * @author Adriano
 */
class Nodo{
    private int dato;
    private Nodo siguiente;

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
}

class Lista {
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Lista{" + "primero=" + primero + ", ultimo=" + ultimo + ", tamanio=" + tamanio + '}';
    }
    
    public boolean Vacio(){
        return primero == null && ultimo == null;
    }
    
    public void Insertar_Inicio(int dato){
        Nodo nuevo = new Nodo(dato, primero);
        primero = nuevo;
        if(ultimo == null){
            ultimo = primero;
        }
        tamanio++;
    }
    
    public void Insertar_Ultimo(int dato){
        if(Vacio()){
            primero = ultimo = new Nodo(dato);
        }else{
            ultimo.setSiguiente(new Nodo(dato));
            ultimo = ultimo.getSiguiente();
        }
        
        tamanio++;
    }
    
    public void Eliminar_Inicio(){
        if(!Vacio()){
            if(primero == ultimo){
                primero = ultimo = null;
            }else{
                primero = primero.getSiguiente();
            }
            tamanio--;
        }
    }
    
    public void Eliminar_Ultimo(){
        if(!Vacio()){
            if(primero == ultimo){
                primero = ultimo = null;
            }else{
                Nodo aux = primero;
                while(aux.getSiguiente()!=ultimo){
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
                ultimo = aux;
            }
            tamanio--;
        }
    }
    
    public String Mostrar(){
        String lista = "";
        if(!Vacio()){
            Nodo aux = primero;
            while(aux!=null){
                lista+=aux.getDato()+" - ";
                aux = aux.getSiguiente();
            }
        }
        return lista;
    }
    
    public String Pares(){
        String lista = "";
        if(!Vacio()){
            Nodo aux = primero;
            while(aux!=null){
                if(aux.getDato()%2==0){
                    lista+=aux.getDato()+" - ";
                }
                aux = aux.getSiguiente();
            }
        }
        return lista;
    }
}

public class video2_ejercicio_01 {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.Insertar_Inicio(26);
        lista1.Insertar_Inicio(50);
        lista1.Insertar_Inicio(34);
        lista1.Insertar_Inicio(37);
        lista1.Insertar_Inicio(21);
        lista1.Insertar_Inicio(10);
        lista1.Insertar_Ultimo(100);
        System.out.println("Numeros pares de la lista "+lista1.Pares());
        System.out.println(lista1.Mostrar());
        
        System.out.println(lista1);
        lista1.Eliminar_Inicio();
        System.out.println(lista1);
        lista1.Eliminar_Ultimo();
        System.out.println(lista1);
        System.out.println(lista1.Mostrar());
    }
}
