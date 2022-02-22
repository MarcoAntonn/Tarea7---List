package uaslp.objetos.list.arraylist;

public class ArrayList {

    private static final int DEFAULT_SIZE = 2; //Esto es una declaración de constantes
    private String[] array;
    private int size;

    //Sobrecarga (cuando no le pasan parámetros)
    public ArrayList(){
        array = new String[DEFAULT_SIZE];
    }

    //Constructor
    public ArrayList(int size){
        array = new String[size];
    }

    //Adds
    public  void addAtTail(String data){
        if(size == array.length){ //Si el numero de datos validos y el tamaño del arreglo, entonces ya no cabe y se usa el metodo increaseArraySize
            increaseArraySize();
        }

        array[size] = data;
        size++;
    }

    public void addAtFront(String data){
        if(size == array.length){
            increaseArraySize();
        }
        if (size >= 0) {
            System.arraycopy(array, 0, array, 1, size); //Recorrido y sussttitución
        }
        array[0] = data;

        size++;
    }

    //Removes
    public void remove(int index){
        if(index < 0 || index >= size){
            return;
        }

        if (size - 1 - index >= 0){
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        array[size-1] = null; //Aqui el garbage collector recoge despues la info sobrante
        size--;
    }

    public void removeAll(){
        for (int i = 0; i<size; i++){
            array[i] = null;
        }
        size = 0;
    }

    //Setters
    public void setAt(int index, String data){
        if(index >= 0 && index < size){
            array[index] = data;
        }
    }

    //Getters
    public String getAt(int index){
        return index >= 0 && index < size ? array[index] : null; //Si index es mayor o igual a 0 y menor que size, entonces array[inndex] es igual a null
    }

    public int getSize(){
        return size;
    }

    public ArrayListIterator getIterator(){
        return new ArrayListIterator(this);
    }

    public static String getName(){
        return "ArrayList";
    }

    //Otros métodos
    private void increaseArraySize(){
        String []newArray = new String[array.length * 2];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
}

