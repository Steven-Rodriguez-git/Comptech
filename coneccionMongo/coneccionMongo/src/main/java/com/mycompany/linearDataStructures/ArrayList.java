
package com.mycompany.linearDataStructures;
public class ArrayList<T extends Comparable<T>>{
    
    /*
        ************** REVISION EL 27/05/2022 **********************
        -Se a�adieron comentarios
        -Se explic� la diferencia de pop() y pop(index)
        -pop() y pop(index) ahora retornan el valor eliminado
        -El search() permite acceder a datos eliminados sin reemplazar
        -Search y push funcionan bien
    */
    
    private T Arrayd[] = (T[]) new Comparable[10]; //Faltan getters y setters, que los genere spring
    int cola = 0;

    public void push(T dato) {
        if (cola == Arrayd.length) {
            T Nuevo_Array[] = (T[]) new Comparable[Arrayd.length * 2]; //crecimiento doble del tamaÃ±o
            for (int i = 0; i < cola; i++) {
                Nuevo_Array[i] = Arrayd[i];
            }
            Arrayd = Nuevo_Array;
        }
        Arrayd[cola] = dato;
        cola++;
    }

    public T pop() {    //LIFO, retorna el �ltimo dato
        cola--;        // PreDecremento
        return Arrayd[cola]; // devolvemos el dato eliminado
    }

    public T pop(int index) {
        T popped = Arrayd[index];
        for (int i = index; i < (Arrayd.length) - 1; i++) { // movemos los datos 1 posicion
            Arrayd[i] = Arrayd[i + 1];            
        }
        cola--; // movemos la cola
        return popped; //retornamos el dato eliminado
    }
    
    public T search(int index){ //Tenemos un caso interesante en el que datos eliminados que no han sido reemplazados por un push puedo acceder a ellos todavia. jaja
        return Arrayd[index];
    }
    
    public int search(T dato){
        for(int i = 0; i<cola; i++){
            if(Arrayd[i] == dato){
                return i;
            }
        }
        return -1;
    }

 

}