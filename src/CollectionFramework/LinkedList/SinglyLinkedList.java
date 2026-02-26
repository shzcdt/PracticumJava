package CollectionFramework.LinkedList;

public class SinglyLinkedList<T> {
    public Node1<T> head;
    private int size = 0;
}

class Node1<T> {
    public T data;
    public Node1<T> next;

    public Node1(T data){
        this.data = data;
        this.next = null;
    }
}