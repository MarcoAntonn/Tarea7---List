package uaslp.objetos.list.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class LinkedListTest {

    @Test //esto dice que es un test
    public void givenANewList_whenGetSize_thenResultIsZero(){
        //Given
        LinkedList<String> list = new LinkedList<>();

        //When:
        int sizeofList = list.getSize();

        //Then:
        Assertions.assertEquals(0, sizeofList, "size of list after creation must be zero"); //valido que el size de la list al crearla sea 0 y pone un msj
    }

    //Excepción, cuando es lanzada
    @Test //esto dice que es un test
    public void givenANewList_whenGetAt_thenExceptionIsThrown(){
        //Given
        LinkedList<String> list = new LinkedList<>();

        //When:
        try{
            list.getAt(0);
            //"modo primitivo de hacer el test de una excepcion que deba lanzarse"
            Assertions.fail("An exception should be thrown getting element zero"); //Si la excepcion no se lanza entonces el test deberia de fallar y al llegar a esta linea yo lo forzo a que falle
        }catch (NotValidIndexException e) {
            //Exception was thrown
        }
    }

    @Test //esto dice que es un test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        //When:
        list.addAtFront("Hola");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(1, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWithElement_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

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
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        //When:
        list.addAtTail("Hola");

        //Then:
        int size = list.getSize();


        Assertions.assertEquals(1, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test //esto dice que es un test
    public void givenAListWithElement_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list = new LinkedList<>();

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
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Mundo", list.getAt(0));
    }

    //Excepción
    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenRemoveIndex3_thenNotValidIndexExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:  aqui el when y el then están mezclados
        //"Metodo No Primitivo"
        Assertions.assertThrows(NotValidIndexException.class, ()->list.remove(3)); //valida que la excepcion NotValidIndexException es lanzada cuando llamo al remove
    }

    //Excepción
    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:  aqui el when y el then están mezclados
        //"Metodo No Primitivo"
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtFront(null)); //valida que la excepcion NotValidIndexException es lanzada cuando llamo al addAtFront
    }

    //Excepción
    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:  aqui el when y el then están mezclados
        //"Metodo No Primitivo"
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtTail(null)); //valida que la excepcion NotValidIndexException es lanzada cuando llamo al addAtTail
    }

    //Excepción
    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:  aqui el when y el then están mezclados
        //"Metodo No Primitivo"
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.setAt(0,null)); //valida que la excepcion NotValidIndexException es lanzada cuando llamo al setAt
    }

    //Excepción
    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenSetAtIndex3_thenNotValidIndexExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:  aqui el when y el then están mezclados
        //"Metodo No Primitivo"
        Assertions.assertThrows(NotValidIndexException.class, ()->list.setAt(3, "Valor")); //valida que la excepcion NotValidIndexException es lanzada cuando llamo al setAt
    }

    @Test //esto dice que es un test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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
    public void givenAListWith3Elements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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
    public void givenAListWithTwoElements_whenSetAtZero_thenElementIsModified() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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
    public void givenAListWith3Elements_whenSetIterator_thenIteratorWorksOverAllThreeElements() throws NotNullValuesAllowedException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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


    //Faltarían probar las excepciones y la forma sería dejando que se lancen, les puse un comentario diciendo que esas eran las excepciones
}

