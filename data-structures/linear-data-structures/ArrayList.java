
package Estructuras;
public class ArrayList<T extends Comparable<T>>{

    T Arrayd[] = (T[]) new Comparable[10];
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

    public void pop() {
        cola--;
    }

    public void pop(int index) {
        for (int i = index; i < (Arrayd.length) - 1; i++) {
            Arrayd[i] = Arrayd[i + 1];
            pop();
        }
    }
    
    public T Search(int index){
        return Arrayd[index];
    }

 

}