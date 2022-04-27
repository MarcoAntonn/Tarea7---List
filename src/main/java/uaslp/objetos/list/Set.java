package uaslp.objetos.list;

import uaslp.objetos.list.exception.NotNullValuesAllowedException;

public interface Set <T>{
    public void add(T element) throws NotNullValuesAllowedException;

    public void remove(T element);

    public boolean contains(T element);

    public Iterator<T> iterator();

    public int size();


}
