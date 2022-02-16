import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();
        LinkedList team3 = new LinkedList();

        team1.addAtTail("Marco");
        team1.addAtTail("Daniel");
        team1.addAtTail("Diego");

        team2.addAtFront("Didier");
        team2.addAtFront("Karime");
        team2.addAtFront("Lori");

        team3.addAtFront("Imelda");

        LinkedListIterator iterator;

        iterator = team1.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        //Debe imprimir los nombres del equipo 1

        iterator = team2.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
