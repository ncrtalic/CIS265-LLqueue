package llqueue;

public class LLQueue implements IQueue {

      private SinglyLL data;

      private int size;

     

      public LLQueue() {

            data=null;

            size=0;

      }

      public int size() {

            //current size

            return size;

      }

      public boolean isEmpty() {

            //true if queue is empty

            return size==0;

      }

     

      public void add(Object item) {

            //creating new node

            SinglyLL newnode=new SinglyLL(item);

            //adding the head node if queue = empty

            if(data==null){

                  data=newnode;

            }else{

                  //finding tail node

                  SinglyLL temp=data;

                  while(temp.next!=null){

                        temp=temp.next;

                  }

                  //appending to tail

                  temp.next=newnode;

            }

            size++;

      }

      public Object first() {

            if(isEmpty()){

             

            return null;

            }

            return data.data;

      }

      public Object remove() {

            if(isEmpty()){

                  return null;

            }

            Object removed=data.data;
            
            data=data.next;
            
            size--;

            return removed;

      }

      private class SinglyLL {

            Object data;

            SinglyLL next;

            public SinglyLL(Object data) {

                  this.data = data;

                  next = null;

            }

      }

}