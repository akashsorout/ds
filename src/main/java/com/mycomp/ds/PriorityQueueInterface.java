package com.mycomp.ds;

public interface PriorityQueueInterface<E extends Comparable> {

    public boolean offer(E o);

    public E poll();

    public int size();

    public boolean isEmpty();

    public void clear();

    public E get(int x);

    public E Set(int x, E item);

    public E peek();
}
