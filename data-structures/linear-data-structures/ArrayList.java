/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear-data-structures;

/**
 *
 * @author tique
 */
public class ArrayList<T extends Comparable<T>>{

    private T Arrayd[] = (T[]) new Comparable[10];
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
    
    public void change(int index,  T ingreso){
        Arrayd[index] = ingreso;
    }
    
    T Search(int index){
        return Arrayd[index];
    }
    public void pop() {
        cola--;
    }

    public void pop(int index) {
        for (int i = index; i < (Arrayd.length) - 1; i++) {
            Arrayd[i] = Arrayd[i + 1];
            pop();
        }
    }
    
    public T[] GetArrayd(){
        if (cola == Arrayd.length){
            return Arrayd;
        }else{
            T arrays[] = (T[]) new Comparable[cola];
            for(int i=0; i<cola; i++){
                arrays[i] = Arrayd[i];
            }
            return arrays;
        }

    }
 

}