package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

//interface
public class ArrayList <T> implements List<T> {

    private static final int DEFAULT_SIZE = 2; //Esto es una declaración de constantes
    private T[] array; //El array ya no es de String, es de T
    private int size;

    //Sobrecarga (cuando no le pasan parámetros)
    public ArrayList() {
        array = (T[]) new Object[DEFAULT_SIZE]; //No se puede generar un arreglo de tipo genérico, por eso se pone (T[])new Object[] creo
    }                       //Todas las clases de Java heredan de Object por eso todos los objetos de cualquier clase pueden ser asignador de tipo Object

    /*//Constructor
    public ArrayList(int size){
        array = (T[])new Object[size];
    }
*/
    //Adds
    @Override
    //se les pone override a los que tienen el simbolo de que se están sobreescribiendo, esto como buena práctica
    public void addAtTail(T data) throws NotNullValuesAllowedException{
        if(data == null){
            throw new NotNullValuesAllowedException();
        }

        if (size == array.length) { //Si el numero de datos validos y el tamaño del arreglo, entonces ya no cabe y se usa el metodo increaseArraySize
            increaseArraySize();
        }

        array[size] = data;
        size++;
    }


    @Override
    public void addAtFront(T data) throws NotNullValuesAllowedException{
        if(data == null){
            throw new NotNullValuesAllowedException();
        }

        if (size == array.length) {
            increaseArraySize();
        }
        if (size >= 0) {
            System.arraycopy(array, 0, array, 1, size); //Recorrido y sussttitución
        }
        array[0] = data;

        size++;
    }

    //Removes
    @Override
    public void remove(int index) throws NotValidIndexException {
        if (index < 0 || index >= size) {
            return;
        }

        if (size - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        array[size - 1] = null; //Aqui el garbage collector recoge despues la info sobrante
        size--;
    }

    @Override
    public void removeAll() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    //Setters
    @Override
    public void setAt(int index, T data) throws NotNullValuesAllowedException, NotNullValuesAllowedException {
        if(data == null){
            throw new NotNullValuesAllowedException();
        }

        if (index >= 0 && index < size) {
            array[index] = data;
        }
    }

    //Getters
    @Override
    public T getAt(int index){
        return index >= 0 && index < size ? array[index] : null; //Si index es mayor o igual a 0 y menor que size, entonces array[inndex] es igual a null
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> getIterator() {
        return new ArrayListIterator<>(this); //aqui el ArrayListIterator cumple con el contrato de Iterator, es decir, tiene los métodos de Iterator
    }

    public static String getName() { //Aqui sigue regresando String
        return "ArrayList";
    }

    //Otros métodos
    private void increaseArraySize() {
        T[] newArray = (T[]) new Object[array.length * 2];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}








//////////////////////////////////////////////////////////////////////////
/*package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

//interface
public class ArrayList <T> implements List<T> {

    private static final int DEFAULT_SIZE = 2; //Esto es una declaración de constantes
    private T[] array; //El array ya no es de String, es de T
    private int size;

    //Sobrecarga (cuando no le pasan parámetros)
    public ArrayList(){
        array = (T[])new Object[DEFAULT_SIZE]; //No se puede generar un arreglo de tipo genérico, por eso se pone (T[])new Object[] creo
    }                       //Todas las clases de Java heredan de Object por eso todos los objetos de cualquier clase pueden ser asignador de tipo Object
*/
    /*//Constructor
    public ArrayList(int size){
        array = (T[])new Object[size];
    }
*/
    //Adds
    /*@Override //se les pone override a los que tienen el simbolo de que se están sobreescribiendo, esto como buena práctica
    public  void addAtTail(T data){
        if(size == array.length){ //Si el numero de datos validos y el tamaño del arreglo, entonces ya no cabe y se usa el metodo increaseArraySize
            increaseArraySize();
        }

        array[size] = data;
        size++;
    }



    @Override
    public void addAtFront(T data){
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
    @Override
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

    @Override
    public void removeAll(){
        for (int i = 0; i<size; i++){
            array[i] = null;
        }
        size = 0;
    }

    //Setters
    @Override
    public void setAt(int index, T data){
        if(index >= 0 && index < size){
            array[index] = data;
        }
    }

    //Getters
    @Override
    public T getAt(int index){
        return index >= 0 && index < size ? array[index] : null; //Si index es mayor o igual a 0 y menor que size, entonces array[inndex] es igual a null
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public Iterator<T> getIterator(){
        return new ArrayListIterator<>(this); //aqui el ArrayListIterator cumple con el contrato de Iterator, es decir, tiene los métodos de Iterator
    }

    public static String getName(){ //Aqui sigue regresando String
        return "ArrayList";
    }

    //Otros métodos
    private void increaseArraySize(){
        T []newArray = (T[])new Object[array.length * 2];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
}*/