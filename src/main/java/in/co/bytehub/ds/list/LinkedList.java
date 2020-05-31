package in.co.bytehub.ds.list;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {

    }

    public void addItemFromStart(T item) {
        Node<T> node = new Node<T>().setItem(item);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addItemFromEnd(T item) {
        Node<T> node = new Node<T>().setItem(item);
        if (isEmpty()) {
            head = node;
        } else {
            Node<T> pointer = head;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
    }

    public T deleteFromEnd() {
        if (!isEmpty()) {
            Node<T> pointer = head.getNext();
            Node<T> pointerToPrevious = head;
            if (pointer == null) {
                head = null;
                return pointerToPrevious.getItem();
            }

            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
                pointerToPrevious = pointerToPrevious.getNext();
            }
            pointerToPrevious.setNext(null);
            size--;
            return pointer.getItem();
        } else {
            System.out.println("LINKED LIST IS EMPTY");
            return null;
        }
    }

    public T deleteFromStart() {
        if (!isEmpty()) {
            Node<T> pointer = head;
            head = pointer.getNext();
            pointer.setNext(null);
            size--;
            return pointer.getItem();
        } else {
            System.out.println("LINKED LIST  IS EMPTY");
            return null;
        }
    }

    public void display() {
        if (!isEmpty()) {
            Node<T> pointer = head;
            while (pointer.getNext() != null) {
                System.out.print(pointer.getItem() + "-->");
                pointer = pointer.getNext();
            }
            System.out.println(pointer.getItem());

        } else {
            System.out.println("LIST IS EMPTY");
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
