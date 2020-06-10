package in.co.bytehub.ds.list;

public class DLLNode<T> {

    private T item;
    private DLLNode previous;
    private DLLNode next;

    public T getItem() {
        return item;
    }

    public DLLNode<T> setItem(T item) {
        this.item = item;
        return this;
    }

    public DLLNode getPrevious() {
        return previous;
    }

    public DLLNode<T> setPrevious(DLLNode previous) {
        this.previous = previous;
        return this;
    }

    public DLLNode getNext() {
        return next;
    }

    public DLLNode<T> setNext(DLLNode next) {
        this.next = next;
        return this;
    }
}
