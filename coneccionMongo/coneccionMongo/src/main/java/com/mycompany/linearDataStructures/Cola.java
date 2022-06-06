package com.mycompany.linearDataStructures;


public class Cola<T extends Comparable<T>> {
    /*
        ************** REVISION EL 27/05/2022 **********************
        -Se a�adieron comentarios gen�ricos para comprender el c�digo.
        -Se cre� isEmpty()
        -enqueue y search funcionan bien
    */
    
    public nodo cabeza = null;
    public nodo cola = null;
    
    public void enqueue(T ingreso){
        nodo nuevo = new nodo(ingreso);
        
        if(cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = null;
        }else{
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = null;
        }
                
    }
    //intent� public T dequeue() pero no me deja
    public Comparable dequeue(){  // Estructura FIFO, dequeue saca el primer dato
        Comparable dequeued = cabeza.dato;
        if (cabeza.siguiente != null){
            cabeza = cabeza.siguiente;
        }else{  //Significa que solo hay un dato
            cabeza = null;
        }
        return dequeued;
    }
    
    public boolean isEmpty(){
        if(cabeza == null){
            return true;
        }else{
            return false;
        }
    }
    
   public Comparable search(int index ){    //intent� public T search() pero no me deja
        nodo buscado = cabeza;
        while(index > 0){
            if(buscado.siguiente == null){
                System.out.println("Out of range"+buscado.siguiente);
                return null; 
            }else{
                buscado = buscado.siguiente;
                index--;
            }
        }
        return buscado.dato;
    }
   
   public int search(T dato){
        nodo buscar = cabeza;
        int contador= 0;
        while(buscar!=null){
            if(dato==buscar.dato){
            //if(0 == buscar.dato.compareTo(dato)){
                return contador;
            }
            buscar = buscar.siguiente;
            contador++;
        }
        return -1;
    }
}