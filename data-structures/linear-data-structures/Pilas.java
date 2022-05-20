/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import Estructuras.ArrayList;
/**
 *
 * @author tique
 */

public class Pilas <T extends Comparable<T>>{

    int tope = 0;
    ArrayList Arrayd = new ArrayList();

    public void push(T ingreso) {
        Arrayd.push(ingreso);
        tope++;
    }

    public void pop() {
        Arrayd.pop(tope);
        tope--;
    }

    public boolean isEmpty() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void Search(int index){
        Arrayd.Search(index);

        if(index%1000==0){
        System.out.print("dato Actual: ");
        Arrayd.Search(index);
        
        }
 
        //TODO
    }
    
}
