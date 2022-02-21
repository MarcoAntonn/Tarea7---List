package uaslp.objetos.list.linkedlist;

public class LinkedListIterator {
    private Node currentNode; //Este es como el aux

    //Constructor
    public LinkedListIterator(Node startNode){
        currentNode = startNode;
    }

    //Otros métodos
    public boolean hasNext(){
        return currentNode != null;
    }

    public String next(){
        String data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}

