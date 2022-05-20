
package Estructuras;

public class ALCircular <T extends Comparable<T>>{  
    //Se muestra el nodo como una lista 
    public class Node{  
        T dato;  
        Node siguiente;   
        public Node(T dato) {  
            this.dato = dato;  
        }  
    }  
  
    //Se declara la cabeza y la cola como nulos
    public Node cabeza = null;  
    public Node cola = null;  
  
    //esta funcion añade el nuevo nodo al final de la lista 
    public void add(T dato){  

        //Se crea el nuevo nodo
        Node newNode = new Node(dato);  

        //revisa si esta vacio
        if(cabeza == null) {  

             //si esta vacio apuntara la cabeza y la cola al nuevo nodo.  
             cabeza = newNode;  
             cola = newNode;  
            newNode.siguiente = cabeza;  
        }  
        else {  
            //la cola apuntara al nuevo nodo  
            cola.siguiente = newNode;  
            //nuevo nodo se convertira en la cola  
            cola = newNode;  
            //Como es ALCircular la cola apuntara a la cabeza
            cola.siguiente = cabeza;  
        }
        
       
    }  
    public T search(int index ){
        Node buscado = cabeza;
        while(index >= 0){
            if(buscado.siguiente == null){
                System.out.println("Out of range");
                return null; 
            }else{
                buscado = buscado.siguiente;
            }
        }
        return buscado.dato;
    }
}