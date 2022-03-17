package uaslp.objetos.list;
//tiene los métodos de la LinkedList
public interface List <T>{ //es tipo interface, se usa en este programa para generalizar y no tener que elegir en el main entre arrayList y LinkedList
    //se ponen los métodos que deben de tener las clases que sigan este mismo contrato
    //Al interface no le importa la implementación de los métodos, sino que solamente le interesa cómo vamos a usar los métodos, por eso no tienen cuerpo

    void addAtTail(T data); //esto ya es public (no es necesario ponerselo otra vez) ya que "quien firma el contrato tiene que hacer sus métodos públicos", o sea que ya es public xd, también es abstract

    void addAtFront(T data);

    void remove(int index);

    void removeAll();

    void setAt(int index, T data);

    T getAt(int index);

    Iterator<T> getIterator();

    int getSize();
}

