package in.co.bytehub.ds.list;

public class DoublyLinkedList<T> {

    private DLLNode<T> head;
    private int size;

    public void addFromBeginning(T item) {
        DLLNode<T> node = new DLLNode<T>()
                .setItem(item);
        DLLNode<T> pointer = head;
        if (!isEmpty()) {
            node.setNext(pointer);
            pointer.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addFromEnd(T item) {
        DLLNode<T> node = new DLLNode<T>()
                .setItem(item);
        if (isEmpty()) {
            head = node;
            size++;
            return;
        }
        DLLNode<T> pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        pointer.setNext(node);
        node.setPrevious(pointer);
        size++;
    }

    public T deleteFromEnd() {
        if (isEmpty()) {
            return null;
        }
        DLLNode<T> pointer = head;
        T deletedItem = null;
        if (pointer.getNext() == null) { // Size == 1
            deletedItem = pointer.getItem();
            head = null;
            size--;
            return deletedItem;
        }
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        deletedItem = pointer.getItem();
        pointer.getPrevious().setNext(null);
        pointer.setPrevious(null);
        size--;
        return deletedItem;
    }

    public void display() {
        DLLNode pointer = head;
        while (pointer != null) {
            System.out.print(pointer.getItem() + "--->");
            pointer = pointer.getNext();
        }
        System.out.println("");
    }

    private boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
