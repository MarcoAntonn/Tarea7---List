package uaslp.objetos.list;

public interface Iterator <T>{ //T es creo el tipo de dato, cada T en cada clase es diferente, no tiene que ver uno con otro
    //Los constructores no se ponen en las interfaces
    boolean hasNext();
    T next();
}
