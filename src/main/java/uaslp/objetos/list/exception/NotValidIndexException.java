package uaslp.objetos.list.exception;

//Throwable -> Error y exception

public class NotValidIndexException extends RuntimeException{//Exception{
    public NotValidIndexException(int wrongIndex){
        //
        super("Index " + wrongIndex + " is out of bounds");//Llamo al constructor de exception para que reciba el msj
    }
}
