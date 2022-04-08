package uaslp.objetos.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;
import uaslp.objetos.list.linkedlist.LinkedList;

public class ArrayListTest {

    @Test //esto dice que es un test
    public void givenANewList_whenGetSize_thenResultIsZero() {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When:
        int sizeofList = list.getSize();

        //Then:
        Assertions.assertEquals(0, sizeofList, "size of list after creation must be zero"); //valido que el size de la list al crearla sea 0 y pone un msj
    }

    //Excepción, cuando es lanzada
    @Test //esto dice que es un test
    public void givenANewList_whenGetAt_thenExceptionIsThrown() {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When:

    }

    @Test //esto dice que es un test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        //When:
        list.addAtFront("Hola");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(1, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWithElement_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");

        //When:
        list.addAtFront("Mundo");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(2, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Mundo", list.getAt(0));
        Assertions.assertEquals("Hola", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        //When:
        list.addAtTail("Hola");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(1, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWithElement_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Hola");

        //When:
        list.addAtTail("Mundo");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(2, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Mundo", list.getAt(0));
    }


    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(1);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWith3Elements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        list.remove(2);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        //When:
        list.remove(1);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Cruel", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        //When:
        list.removeAll();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenSetAtZero_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");

        //When:
        list.setAt(0, "Hola");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }


    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:  aqui el when y el then están mezclados
        //"Metodo No Primitivo"
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.setAt(0,null)); //valida que la excepcion NotValidIndexException es lanzada cuando llamo al setAt
    }

    @Test //esto dice que es un test
    public void givenAListWith3Elements_whenSetIterator_thenIteratorWorksOverAllThreeElements() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        Iterator<String> iterator = list.getIterator();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator); //validamos que el operador no es null
        Assertions.assertTrue(iterator.hasNext());//Valido que el hasNext me dice que si puedo agarrar un elemento
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test //esto dice que es un test
    public void givenANewList_whenGetName_thenResultIsZero() {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When:
        String name = list.getName();

        //Then:
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given:
        ArrayList<String> array=new ArrayList<>(); //Crea un objeto de la lista
        array.addAtFront("Hola");
        array.addAtTail("Mundo");
        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->array.addAtTail(null));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given:
        ArrayList<String> array=new ArrayList<>(); //Crea un objeto de la lista
        array.addAtFront("Hola");
        array.addAtFront("Mundo");
        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->array.addAtFront(null));
    }

}







/*package uaslp.objetos.list.arraylist;//package uaslp.objetos.list.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class ArrayListTest {

    @Test //esto dice que es un test
    public void givenANewList_whenGetSize_thenResultIsZero() {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When:
        int sizeofList = list.getSize();

        //Then:
        Assertions.assertEquals(0, sizeofList, "size of list after creation must be zero"); //valido que el size de la list al crearla sea 0 y pone un msj
    }

    @Test //esto dice que es un test
    public void givenANewList_whenGetName_thenResultIsZero() {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When:
        String name = list.getName();

        //Then:
    }

    @Test //esto dice que es un test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() {//throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        //When:
        list.addAtFront("Hola");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(1, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWithElement_whenAddAtFrontAnElement_thenSizeIsTwo() {//throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");

        //When:
        list.addAtFront("Mundo");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(2, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Mundo", list.getAt(0));
        Assertions.assertEquals("Hola", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() {//throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        //When:
        list.addAtTail("Hola");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(1, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWithElement_whenAddAtTailAnElement_thenSizeIsTwo() {//throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Hola");

        //When:
        list.addAtTail("Mundo");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(2, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() {// throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenRemoveIndex0_thenSizeIsOne() {// throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Mundo", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() { //throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(1);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWith3Elements_whenRemoveElementAtTail_thenSizeIsTwo() { //throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        list.remove(2);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() {// throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        //When:
        list.remove(1);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Cruel", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() { //throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        //When:
        list.removeAll();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenSetAtZero_thenElementIsModified() { //throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");

        //When:
        list.setAt(0, "Hola");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test //esto dice que es un test
    public void givenAListWith3Elements_whenSetIterator_thenIteratorWorksOverAllThreeElements() { //throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        Iterator<String> iterator = list.getIterator();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator); //validamos que el operador no es null
        Assertions.assertTrue(iterator.hasNext());//Valido que el hasNext me dice que si puedo agarrar un elemento
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

}
*/