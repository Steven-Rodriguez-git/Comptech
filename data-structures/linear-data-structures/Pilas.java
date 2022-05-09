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

public class Pilas <T extends Comparable<T>>{

    int tope = 0;
    private ArrayList Arrayd = new ArrayList();

    void push(T ingreso) {
        Arrayd.push(ingreso);
        tope++;
    }
    
    void Change(int index,T ingreso){
        Arrayd.Change(index,ingreso);
    }
    
    T Search(int index){
        return Arrayd.Search(index);
    }

    void pop() {
        Arrayd.pop(tope);
        tope--;
    }

    boolean isEmpty() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }
    public T[] getArrayd(){
        return Arrayd.GetArrayd();
    }
}