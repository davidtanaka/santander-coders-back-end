package fila;

public class Queue {
     private Node first;
     private Node last;
     private int length;

     public class Node {
          int value;

          Node next;

          Node(int value){
               this.value = value;
          }
     }


public Queue(int value) {
     Node newNode = new Node(value);
     first = newNode;
     last = newNode;
     length++;
}


public void getFirst() {
     if (first != null) {
          System.out.println("O primeiro valor é " + first.value);
     } else {
          System.out.println("Fila está vazia");
     }
}

public void getLast() {
     if (last != null) {
          System.out.println("O ultimo valor é " + last.value);
     } else {
          System.out.println("Fila está vazia");
     }
}

public void getLength() {
     System.out.println("Length: " + length);
}

public void print() {
     System.out.println("#########################");
     Node temp = first;
     while(temp != null){
          System.out.println(temp.value);
          temp = temp.next;
     }
     System.out.println("#########################");
}


public static void main(String[] args){
     Queue myQueue = new Queue(1);

     myQueue.getFirst();
     myQueue.getLast();
     myQueue.getLength();

     myQueue.print();
}


}