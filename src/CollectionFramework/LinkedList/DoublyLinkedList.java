package CollectionFramework.LinkedList;

public class DoublyLinkedList<T> {
    public Node2<T> head;
    public Node2<T> tail;
    private int size = 0;
}

class Node2<T> {
    public T data;
    public Node2<T> next;
    public Node2<T> prev;

    public Node2(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}