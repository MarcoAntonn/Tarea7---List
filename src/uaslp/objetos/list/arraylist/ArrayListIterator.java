package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class ArrayListIterator <T> implements Iterator<T> { //se tienen que poner los 2 T, si no se pone el primero no sabrá qué es T, creo esto es por el implements
    private final ArrayList<T> arrayList;//final porque arrayList lo asigno solo en el constructor y nunca más lo vuelvo a asignar(no va a cambiar)
    private int currentItem;

    //Constructor
    public ArrayListIterator (ArrayList<T> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext(){ //los métodos se tienen que llamar igual que en Iterator (se tiene que cumplir con el contrato)
        return currentItem < arrayList.getSize(); //Regresa verdadero si el currentItem es menor al size del arrayList
    }

    @Override
    public T next(){
        T data = arrayList.getAt(currentItem);

        currentItem++;

        return data;
    }
}
