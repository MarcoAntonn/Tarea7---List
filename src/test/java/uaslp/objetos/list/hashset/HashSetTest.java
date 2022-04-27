
package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;

public class HashSetTest {
    @Test
    public void givenANewSet_whenGetSize_thenResultIsZero(){
        //Given:
        HashSet<String> set = new HashSet<>();

        //When:
        int sizeOfSet = set.size();

        //Then:
        Assertions.assertEquals(0, sizeOfSet, "size of set after creation must be");
    }

    @Test
    public void givenANewSet_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException{
        //Given:
        HashSet<String> set = new HashSet<>();

        //When:
        set.add("Hola");

        //Then:
        int size = set.size();

        Assertions.assertEquals(1, size);
        Assertions.assertTrue(set.contains("Hola"));
    }

    @Test
    public void givenASetWithOneElement_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException{
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Hola");

        //When
        set.add("Mundo");

        //Then
        int size = set.size();

        Assertions.assertEquals(2, size); //valido que el size de la lista al crearla sea 1
        Assertions.assertTrue( set.contains("Hola"));
        Assertions.assertTrue(set.contains("Mundo"));
    }


    @Test
    public void givenASetWithOneElement_whenRemove_thenSizeIsZero() throws NotNullValuesAllowedException{
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Hola");

        //When

        set.remove("Hola");

        //Then
        int size = set.size();

        Assertions.assertEquals(0, size);
        Assertions.assertFalse(set.contains("Hola"));
    }

    @Test
    public void givenASetWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotNullValuesAllowedException{
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Hola");
        set.add("Mundo");

        //When
        set.remove("Hola");

        //Then
        int size = set.size();

        Assertions.assertEquals(1, size);
        Assertions.assertFalse(set.contains("Hola"));
        Assertions.assertTrue(set.contains("Mundo"));

    }


    @Test
    public void givenASetWithThreeElements_whenGetIterator_thenIterator() throws NotNullValuesAllowedException{
        //Given
        HashSet<String> set = new HashSet<>();

        set.add("Adios");
        set.add("Mundo");
        set.add("Cruel");

        //When
        Iterator<String> iterator = set.iterator();

        //Then
        int size = set.size();
        HashSet<String> iterations = new HashSet<>();

        //Assertions.assertEquals(3, size);
        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);

        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        iterations.add(iterator.next());

        Assertions.assertFalse(iterator.hasNext());

        Assertions.assertTrue(set.contains("Adios"));
        Assertions.assertTrue(set.contains("Mundo"));
        Assertions.assertTrue(set.contains("Cruel"));

        Assertions.assertThrows(NotSuchElementException.class, iterator::next);
    }

    @Test
    public void givenAHugeHashSetWith150Elements_whenGetIterator_thenReorganize() throws NotNullValuesAllowedException{
        int i=0, j=0; //contadores
        //Given
        HashSet<String> hs = new HashSet<>();

        while (i<150){ //añade al hashcode varios elementos
            hs.add("i=" + i);
            i++;
        }

        //when
        Iterator<String> iterator = hs.iterator();

        //Then
        int size = hs.size();

        HashSet<String> hs_iterations = new HashSet<>(); //HashSet auxiliar para iteraciones

        Assertions.assertEquals(150, size); //comprueba el tamaño
        Assertions.assertNotNull(iterator);

        while (iterator.hasNext()){ //añade las iteraciones al auxiliar
            hs_iterations.add(iterator.next());
        }

        while (j<150){ //comprueba que estén los elementos en hs
            Assertions.assertTrue(hs.contains("i=" + j));
            j++;
        }
    }
}
