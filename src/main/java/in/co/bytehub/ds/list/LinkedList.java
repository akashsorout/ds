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

    public void addItemAtPosition(T item, int position) {
        Node<T> node = new Node().setItem(item);
        Node<T> pointer = head;

        if (position < 0) {
            position = 0;
        }

        if (position > size) {
            position = size;
        }

        if (isEmpty() || position == 0) {
            node.setNext(head);
            head = node;
        } else {
            // If we want to add an element at position 3, we have to stop at position 2, One step before
            for (int i = 0; i < position - 1; i++) {
                pointer = pointer.getNext();
            }
            node.setNext(pointer.getNext());
            pointer.setNext(node);
        }

        size++;
    }

    public T deleteFromPosition(int position) {
        Node<T> pointer = head;
        if (isEmpty()) {  // size == 0
            return null;
        }
        if (pointer.getNext() == null) { // size == 1
            head = null;
            size--;
            return pointer.getItem();
        }
        if (position < 0) {
            position = 0;
        }
        if (position >= size) {
            position = size - 1; // Delete Last Element
        }
        for (int i = 0; i < position - 1; i++) {
            pointer = pointer.getNext();
        }
        if (pointer.getNext().getNext() == null) { // Delete Last Node
            T item = (T) pointer.getNext().getItem();
            pointer.setNext(null);
            size--;
            return item;
        } else { // Delete from middle
            Node nextNode = pointer.getNext().getNext();
            T deletedItem = (T) pointer.getNext().getItem();
            pointer.getNext().setNext(null);
            pointer.setNext(nextNode);
            size--;
            return deletedItem;
        }
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
//            pointer.setNext(null);
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

    public Node<T> getHead(){
        return head;
    }
}
