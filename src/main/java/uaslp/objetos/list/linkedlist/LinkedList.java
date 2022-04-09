package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

//Interface
public class   LinkedList <T> implements List <T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;//para error seria size=1

    //Adds
    public void addAtTail(T data) throws NotNullValuesAllowedException{
        if(data == null){
            throw new NotNullValuesAllowedException();
        }

        Node<T> node = new Node<>(data);//El <> es opcional, es una recomendacion del IDE, donde es necesario es en la declaración  Node<T> al inicio del renglon

        if (size == 0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }

        tail = node;
        size++;
    }

    public void addAtFront(T data) throws NotNullValuesAllowedException{
        if(data == null){
            throw new NotNullValuesAllowedException();
        }

        Node<T> node = new Node(data);

        if (size == 0) {
            tail = node;
        } else {
            head.previous = node;
        }
        node.next = head;
        head = node;

        size++;
    }

    //Removes
    public void remove(int index) throws NotValidIndexException{
        Node<T> node = findNode(index);

        /*if(node == null){ //lo eliminamos ya que en el test se identificó que esto estaba mal ya que node siempre sería diferente de null
            return;
        }*/

        if(size == 1){
            head = null;
            tail = null;
        } else if(node == head){ //Si queremos comparar el contenido de un string usamos (str1.equals(str2))
            head = node.next;
            /*if(head != null){
                head.previous = null;
            }*/
        } else if(node == tail){ //Si queremos comparar el contenido de un string usamos (str1.equals(str2))
            tail = node.previous;
            /*if(tail != null){
                tail.next = null;
            }*/
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        size--;
    }

    public void removeAll() { //Aqui basta que se ponga en null para que el Garbage Collector elimine la memoria guardada
        head = null;
        tail = null;
        size = 0;
    }

    //Setters
    public void setAt(int index, T data) throws NotValidIndexException, NotNullValuesAllowedException { //aqui se propaga la exception porque llama a findNode y ese método también lo hace
        if(data == null){
            throw new NotNullValuesAllowedException();
        }

        Node<T> node = findNode(index);

        //if(node != null){
            node.data = data;
        //}
    }

    //Getters
    public T getAt(int index) throws NotValidIndexException{
        Node<T> node = findNode(index);

        return node == null ? null : node.data; //Si node = null regresa null, sino regresa node.data
    }

    public Iterator<T> getIterator() {
        return new LinkedListIterator<>(head);
    }

    public int getSize() {
        return size;
    }

    //Otros
    private Node<T> findNode(int index) throws NotValidIndexException{

        if(index < 0 || index >= size){
            throw new NotValidIndexException(index); //throw recibe un parametro y recibe un objeto(por eso es new)
        }

        Node<T> node = head;
        int currentIndex = 0;

        while (currentIndex != index) { //Recorre todos
            currentIndex++;
            node = node.next;
        }

        return node;
    }
}