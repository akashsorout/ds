package in.co.bytehub.app;

import in.co.bytehub.ds.list.DoublyLinkedList;

public class DoublyLinkedListTester {

    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();

        doublyLinkedList.addFromBeginning("FirstString");
        doublyLinkedList.addFromBeginning("SecondString");
        doublyLinkedList.addFromBeginning("ThirdString");
        doublyLinkedList.addFromEnd("FROMEnd");
        doublyLinkedList.addFromEnd("FROMEnd2");
        doublyLinkedList.display();
        System.out.println("doublyLinkedList.deleteFromEnd() = " + doublyLinkedList.deleteFromEnd());
        doublyLinkedList.display();
        System.out.println("doublyLinkedList.deleteFromEnd() = " + doublyLinkedList.deleteFromEnd());
        doublyLinkedList.display();

        System.out.println("doublyLinkedList.deleteFromBeginning() = " + doublyLinkedList.deleteFromBeginning());
        doublyLinkedList.display();


    }
}
