package uaslp.objetos.list.linkedlist;

public class LinkedList {

  private Node head;
  private Node tail;
  private int size;

  public void addAtTail (String data){
      Node node = new Node(data);

      if(size == 0){
          head = node;
      }else {
          tail.next = node;
          node.previous = tail;
      }

      tail = node;
      size ++;
  }

  public void addAtFront(String data){
      Node node = new Node(data);

      if(size == 0){
          tail = node;
      }else{
          head.previous = node;
      }
      node.next = head;
      head = node;

      size++;
  }

  public void remove(int index){

  }

  public void removeAll(){

  }

  public void setAt(int index, String data){

  }

  public String getAt(int index){
      return null;
  }

  public void removeAllWithValue(String data){

  }

    public void setSize(int size) {
        this.size = size;
    }

  public LinkedListIterator getIterator(){
      return null;  //Aqui marca error pero supongo que es porque aún no está la función
  }
}
