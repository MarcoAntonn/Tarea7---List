package uaslp.objetos.list.linkedlist;

//interface
class Node <T> { //puede haber más de un tipo, o sea puede ser <T, G>
    T data;
    Node<T> next;
    Node<T> previous;

    Node(T data){
        this.data = data;
    }
}


