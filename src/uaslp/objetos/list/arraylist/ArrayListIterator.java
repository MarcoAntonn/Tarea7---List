package uaslp.objetos.list.arraylist;
public class ArrayListIterator {
    private ArrayList arrayList;
    private int currentItem;

    //Constructor
    public ArrayListIterator (ArrayList arrayList){
        this.arrayList = arrayList;
    }

    public boolean hasNext(){
        return currentItem < arrayList.getSize(); //Regresa verdadero si el currentItem es menor al size del arrayList
    }

    public String next(){
        String data = arrayList.getAt(currentItem);

        currentItem++;

        return data;
    }
}
