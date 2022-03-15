package llqueue;

public class QueueFullException extends Exception {
public QueueFullException(String str){
System.out.println("QueueFullException:" + str);
}
public QueueFullException (){
this("No space left");
}
}
