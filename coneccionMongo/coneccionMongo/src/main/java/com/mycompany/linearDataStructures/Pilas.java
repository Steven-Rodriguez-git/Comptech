
package com.mycompany.linearDataStructures;
import com.mycompany.linearDataStructures.ArrayList; // Este import me marca como que "no encuentra ArrayList" pero si lo quito da m�s errores lol.

public class Pilas{
    /*
        ************** REVISION EL 27/05/2022 **********************
        -Se actualiz� el remove. ahora retorna el gen�rico que elimin�.
        -Se encontr� que Search a�n da acceso a datos "eliminados" por remove (no sabia si arreglarlo o dejarlo)
        -Se actualizaron los nombres de push -> insert y de pop -> remove
        -insert y remove funcionan bien
    */
    int tope = 0;
    ArrayList Arrayd = new ArrayList();

    public void insert(Comparable ingreso) { //antes llamado push por error
        Arrayd.push(ingreso);
        tope++;
    }

    public Comparable remove() { // LIFO, removemos el �ltimo
        tope--;
        return Arrayd.pop();        
    }

    public boolean isEmpty() {  // bool
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public Comparable Search(int index){    // Puedo acceder tambien a posiciones de datos recientemente eliminados o:
        return Arrayd.search(index);
    }
    
    public int Search(Comparable dato){
        return Arrayd.search(dato);
    }
}
