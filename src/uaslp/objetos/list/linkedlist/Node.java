package uaslp.objetos.list.linkedlist;

//interface
class Node { //puede haber más de un tipo, o sea puede ser <T, G>
    String data;
    Node next;
    Node previous;

    Node(String data){
        this.data = data;
    }
}


