package com.mycompany.linearDataStructures;

/*
        ************** REVISION EL 27/05/2022 **********************
        -cambi� node por nodo
        -Elimin� la class nodo que iba anidada a la class AlCircular porque se cre� en su propia clase llamada nodo para varios usos
        -Se modific� el c�digo de search donde habia un bucle infinito. (se recomienda borar el comentariado de seaarhc)
 */
public class ALCircular<T extends Comparable<T>> {

    //Se declara la cabeza y la cola como nulos
    public nodo cabeza = null;
    public nodo cola = null;

    //esta funcion añade el nuevo nodo al final de la lista 
    public void add(T dato) {

        //Se crea el nuevo nodo
        nodo newnodo = new nodo(dato);

        //revisa si esta vacio
        if (cabeza == null) {

            //si esta vacio apuntara la cabeza y la cola al nuevo nodo.  
            cabeza = newnodo;
            cola = newnodo;
            newnodo.siguiente = cabeza;
        } else {
            //la cola apuntara al nuevo nodo  
            cola.siguiente = newnodo;
            //nuevo nodo se convertira en la cola  
            cola = newnodo;
            //Como es ALCircular la cola apuntara a la cabeza
            cola.siguiente = cabeza;
        }

    }

    public Comparable search(int index) {
        if (cabeza != null) {
            nodo buscado = cabeza;
            for (int i = 0; i < index; i++) {
                if (buscado.siguiente != null) {
                    buscado = buscado.siguiente;
                } else {
                    System.out.println("Out of range"); // En teoria nunca se va a ejecutar este else, porque al llegar a la cola, el siguiente va a ser la cabeza.
                                                        //Adem�s estan inicializados como null
                    break;
                }
            }
            return buscado.dato; // Basicamente si buscas un index que supera el arreglo, vuelve a comenzar desde el inicio
        } else {
            return null;
        }

        //Se recomienda eliminar el siguiente fragmento de c�digo que no serv�a
        /*
        while(index >= 0){  //Search entra en bucle infinito
            if(buscado.siguiente == null){
                System.out.println("Out of range");
                return null; 
            }else{
                buscado = buscado.siguiente;
            }
        }*/
        
    }
    
    public int search(T dato){
        nodo buscar = cabeza;
        int contador= 0;
        while(buscar!=cola && buscar!=null){
            if(0 == buscar.dato.compareTo(dato)){
                return contador;
            }
            contador++;
            buscar = buscar.siguiente;
        }
        if(buscar==null){ // reviso la cola
            return -1;
        }else if(0 == buscar.dato.compareTo(dato)){
            return contador;
        }
        return -1;
    }
    
    public T delete(int index){
        if(cabeza!=null){
            nodo buscado = cabeza;
            for(int i =0; i<index-1; i++){
                if(buscado.siguiente!=null){
                    buscado = buscado.siguiente;
                }
            }
            nodo despues = buscado.siguiente.siguiente;
            if(cola == buscado.siguiente){
                cola = despues;
            }
            buscado.siguiente=despues;
        }
    }
}
