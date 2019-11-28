package com.company;

/** Queue ADT */
public interface IQueue<E> {
    /** Place an element at the rear of the queue.
     * @param it The element being enqueued. */
    public void enqueue(E it);
    /** Remove and return element at the front of the queue.
     @return The element at the front of the queue. */
    public E dequeue();
    /** @return The number of elements in the queue. */
    public int length();
}

