package in.co.bytehub.ds.list;

public class Node<T> {

    private T item;
    private Node next;

    public T getItem() {
        return item;
    }

    public Node<T> setItem(T item) {
        this.item = item;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node<T> setNext(Node next) {
        this.next = next;
        return this;
    }
}
