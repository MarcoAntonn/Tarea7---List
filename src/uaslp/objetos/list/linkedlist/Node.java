package uaslp.objetos.list.linkedlist;

public class Node {

   String data; //Los atributos se inicializan en null por defaul
   Node next;
   Node previous;

   //Constructor
   Node(String data){
       this.data = data;
   }

   //Esto no está en el codigo PLANTUML
    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public String getData() {
        return data;
    }
}
