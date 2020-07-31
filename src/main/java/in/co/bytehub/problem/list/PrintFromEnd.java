package in.co.bytehub.problem.list;

import in.co.bytehub.ds.list.LinkedList;
import in.co.bytehub.ds.list.Node;

public class PrintFromEnd {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.addItemFromEnd("Item1");
        list.addItemFromEnd("Item2");
        list.addItemFromEnd("Item3");
        list.addItemFromEnd("Item4");
        list.addItemFromEnd("Item5");
        list.addItemFromEnd("Item6");
        list.display();
        printFromEnd(list.getHead());

    }

    private static <K> void  printFromEnd(Node<K> head){
        if(head == null){
            return;
        }
        printFromEnd(head.getNext());
        System.out.print("-->" + head.getItem());
    }
}
