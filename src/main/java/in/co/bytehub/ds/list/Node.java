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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("item=").append(item);
        sb.append('}');
        return sb.toString();
    }
}
