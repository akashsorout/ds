package com.mycomp.ds;

public class NSPQ<E> extends PriorityQueue<E> {

    public PriorityNode<E> poll() {
        PriorityNode<E> removedNode = super.poll();
        for (PriorityNode<E> priorityNode : items) {
            int priority = priorityNode.getPriority();
            priorityNode.setPriority(--priority);
        }
        return removedNode;
    }
}
