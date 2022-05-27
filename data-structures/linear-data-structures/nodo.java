package Estructuras;

class nodo<T extends Comparable<T>> {
    /*
        ************** REVISION EL 27/05/2022 **********************
        -Fué creada esta clase el día de hoy para no tener clases anidadas en las otras estructuras.
    */
        T dato;
        nodo siguiente;
        public nodo(T dato) {
            this.dato = dato;
        }
        
    }
