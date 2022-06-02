package Estructuras;

/*
        ************** REVISION EL 27/05/2022 **********************
        -cambié node por nodo
        -Eliminé la class nodo que iba anidada a la class AlCircular porque se creó en su propia clase llamada nodo para varios usos
        -Se modificó el código de search donde habia un bucle infinito. (se recomienda borar el comentariado de seaarhc)
 */
public class ALCircular<T extends Comparable<T>> {

    //Se declara la cabeza y la cola como nulos
    public nodo cabeza = null;
    public nodo cola = null;

    //esta funcion aÃ±ade el nuevo nodo al final de la lista 
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
                                                        //Además estan inicializados como null
                    break;
                }
            }
            return buscado.dato; // Basicamente si buscas un index que supera el arreglo, vuelve a comenzar desde el inicio
        } else {
            return null;
        }

        //Se recomienda eliminar el siguiente fragmento de código que no servía
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
}
