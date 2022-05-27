package Estructuras;

/*
        ************** REVISION EL 27/05/2022 **********************
        -Por alguna razón habia 3 clases en una sola clase de nombre LinkedList o.O, se arreglaron a solo 1.
        -Se reemplazó T por solo Comparable
        -Node se cambió por nodo
        -data se cambió por dato
        -Se hizo format al código porque estaba con tabulaciones raras.
        -Se añadieron MUCHOS comentarios para cuando se le haga revisión de datos al código
        -add no funciona, el dato se pierde y al usar display solo aparece el dato que inicialicé en tiempo de compilación ademas de nullpointer exceptions
 */

class linkedList {  //Es una LinkedList pero sin cola  y 1 solo enlace osea simple

    public nodo add(nodo head, Comparable dato, int position) {
        nodo start = head;
        nodo copia;
        
        for (int i = 0; i < position; i++) {
            start = start.siguiente;
        }
        
        copia = start.siguiente;
        start.siguiente = null; // Se me hace que esta linea sobra, pero la dejaré para cuando haga pruebas.
        start = insertBack(start, dato); // Acá solo se edita Start.siguiente
        start.siguiente = copia; // Acá se vuelve a editar Start.siguiente.... este codigo funciona? xd

        return start;
    }

    public int getSize(nodo head) {
        int tamano = 0;
        nodo start = head;
        while (start != null) {
            tamano++;
            start = start.siguiente;
        }

        return tamano;
    }

    public nodo makeEmpty(nodo head) {
        return head = null;
    }

    public boolean isEmpty(nodo head) {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void getFront(nodo head) {
        System.out.println(head.dato);
        //ComparableODO
    }

    /*
    public Comparable getBack (nodo head){
    nodo start = head;
        while(start != null){
            start = start.siguiente;
        }
        return start.dato;
    }

     */
    public nodo popFront(nodo head) {   // con 1 solo dato genera nullException porque siguiente no ha sido inicializada
        head = head.siguiente;
        return head;
    }

    public nodo popBack(nodo head) {
        nodo start = head;
        while (start.siguiente != null) {   //Al añadirle 1 solo dato no realiza el pop
            start = start.siguiente;
        }
        return start;

    }

    public nodo insertFront(nodo head, Comparable dato) { //Insertar en la primera posición de la lista.
        if (head.dato == null) {//Un if para insertar cuando la lista está vacia
            nodo start = new nodo(dato);
            return start;
        }
        nodo start = new nodo(dato);
        start.siguiente = head;
        return start;
    }

    public nodo insertBack(nodo head, Comparable dato) {
        if (head == null) {
            return new nodo(dato);
        } else if (head.siguiente == null) {
            head.siguiente = new nodo(dato);    // Insert Back guarda en la siguiente posicion? eso no deberia ser inserFront?
        } else {
            insertBack(head.siguiente, dato);
        }
        return head;

    }

    public void display(nodo head) {
        nodo start = head;
        while (start != null) {
            System.out.print(start.dato + " ");
            start = start.siguiente;
        }
    }

}
