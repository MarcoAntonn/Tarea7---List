package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

//Aun no se modifica
public class LinkedListIterator implements Iterator{
    private Node currentNode; //Este es como el aux

    //Constructor
    public LinkedListIterator(Node startNode){
        currentNode = startNode;
    }

    //Otros métodos
    @Override
    public boolean hasNext(){
        return currentNode != null;
    }

    @Override
    public String next(){
        String data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}
