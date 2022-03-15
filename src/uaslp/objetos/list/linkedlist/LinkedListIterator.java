package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

//Aun no se modifica
public class LinkedListIterator <T> implements Iterator <T>{
    private Node<T> currentNode; //Este es como el aux

    //Constructor
    public LinkedListIterator(Node<T> startNode){
        currentNode = startNode;
    }

    //Otros métodos
    public boolean hasNext(){
        return currentNode != null;
    }

    public T next(){
        T data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}
