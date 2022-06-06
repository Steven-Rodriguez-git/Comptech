package com.mycompany.linearDataStructures;

/*
        ************** REVISION EL 27/05/2022 **********************
        -Por alguna raz�n habia 3 clases en una sola clase de nombre LinkedList o.O, se arreglaron a solo 1.
        -Se reemplaz� T por solo Comparable
        -Node se cambi� por nodo
        -data se cambi� por dato
        -Se hizo format al c�digo porque estaba con tabulaciones raras.
        -Se a�adieron MUCHOS comentarios para cuando se le haga revisi�n de datos al c�digo
        -add no funciona, el dato se pierde y al usar display solo aparece el dato que inicialic� en tiempo de compilaci�n ademas de nullpointer exceptions
        -se renombr� a linkedList (sin la L may)por temas de palabras reservadas,
 */
public class linkedList {  //Es una LinkedList pero sin cola  y 1 solo enlace osea simple

    private nodo head = null;

    public void add(Comparable dato) {
        nodo start = head;
        if (start == null) {
            head = new nodo(dato);
        } else {
            while (start.siguiente != null) {
                start = start.siguiente;
            }
            start.siguiente = new nodo(dato);
        }

    }

    public void add(Comparable dato, int position) {
        nodo start = head;

        for (int i = 0; i < position; i++) {
            if (start.siguiente != null) {
                start = start.siguiente;
            }
        }

        start.siguiente = new nodo(dato);

        /*
        copia = start.siguiente;
        start.siguiente = null; // Se me hace que esta linea sobra, pero la dejar� para cuando haga pruebas.
        start = insertBack(start, dato); // Ac� solo se edita Start.siguiente
        start.siguiente = copia; // Ac� se vuelve a editar Start.siguiente.... este codigo funciona? xd

        return start;*/ // Ya el c�digo no retorna.
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

    public void makeEmpty(nodo head) {
        head = null;
    }

    public boolean isEmpty(nodo head) {
        if (head == null) {
            return true;
        }
        return false;
    }
    
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public Comparable getFront() {
        return head.dato;
        //ComparableODO
    }

    public boolean search(Comparable data){
        nodo cabeza = head;
        while(cabeza!=null){
            if(data==head.dato){
                return true;
            }
            cabeza = cabeza.siguiente;
        }
        return false;
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
    public Comparable popFront() {   // Arreglado el error de cuando habia 1 solo dato
        if (head != null) {
            nodo popped = head;
            head = head.siguiente;
            return popped.dato;
        } else {
            return null;
        }

    }

    public nodo popBack(nodo head) {
        nodo start = head;
        while (start.siguiente != null) {   //Al a�adirle 1 solo dato no realiza el pop
            start = start.siguiente;
        }
        return start;

    }

    // *************** CODIGO REPETIDO, AARRIBA SE LE LLAMO ADD ******************
/*
    public nodo insertFront(nodo head, Comparable dato) { //Insertar en la primera posici�n de la lista.
        if (head.dato == null) {//Un if para insertar cuando la lista est� vacia
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
     */
    public void display() {
        if(isEmpty()){
            System.out.println("Ta vacio brother");
        }else{
            nodo start = head;
            while(start != null){
                System.out.print(start.dato+" ");
                start = start.siguiente;
            }
        }
        
    }

}
