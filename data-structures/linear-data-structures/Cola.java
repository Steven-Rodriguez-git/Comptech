
package Estructuras;

public class Cola<T extends Comparable<T>> {

    public class nodo {

        T dato;
        nodo siguiente;

        public nodo(T dato) {
            this.dato = dato;
        }

    }
    
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
    
    public void dequeue(){
        if (cabeza.siguiente != null){
            cabeza = cabeza.siguiente;
        }
    }
    
   public T search(int index ){
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
}