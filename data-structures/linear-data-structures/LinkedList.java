package Estructuras;

public class LinkedList <T extends Comparable<T>>{

public class Node <T extends Comparable<T>>{
    T data;
    Node next;
    Node (T d){
        data = d;
        next = null;
    }

}

class linkedList <T extends Comparable<T>>{
    public Node add(Node head,T data, int position){
    Node start = head;
    Node copia = head;
    for(int i=0;i<position;i++){
        start = start.next;
    }
    copia =start.next;
    start.next= null;
    start = insertBack(start,data);
    start.next = copia;

    return start;
    }



    public int getSize(Node head){
        int tamano = 0;
        Node start = head;
        while(start != null){
            tamano++;
            start = start.next;
        }


        return tamano;
    }


    public Node makeEmpty(Node head){
        return head = null;
    }
    public boolean isEmpty(Node head){
        if(head==null){
            return true;
        }
        return false;
    }
    
    
    public void getFront(Node head){
        System.out.println(head.data);
        //TODO
    }
    /*
    public T getBack (Node head){
    Node start = head;
        while(start != null){
            start = start.next;
        }
        return start.data;
    }

    */
    public Node popFront (Node head){
        head = head.next;
        return head;
    }
    public Node popBack (Node head){
    Node start = head;
    while(start.next != null){
        start = start.next;
    }
    return start;
    
    }
    public Node insertFront (Node head,T data){
        if(head.data==null){
            Node start = new Node(data);
            return start;
        }
        Node start = new Node(data);
        start.next = head;
        return start;
    }
    public Node insertBack(Node head, T data){
        if(head==null){
            return new Node(data);
        }
        else if(head.next==null){
            head.next = new Node(data);
        }
        else{
            insertBack(head.next,data);
        }
        return head;

    }
    public void display(Node head){
        Node start = head;
        while(start != null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    
}

}
