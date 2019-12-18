package com.company;
import java.lang.*;

public class Queue<E> implements IQueue
{

    private int front, rear, size=0, capacity;
    private E[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size =0;
        rear = capacity-1;
        array = (E[])new Object[capacity];

    }

    boolean isEmpty(Queue tempQueue)
    {
        return(tempQueue.size==0);
    }

    private boolean isFull(Queue tempQueue)
    {
        return (tempQueue.size == tempQueue.capacity);
    }

    @Override
    public void enqueue(Object it)
    {
        if (isFull(this))
            System.out.println("Queue is full, item has been put in front");

        this.rear = (this.rear + 1)%this.capacity;
        this.array[this.rear] = (E) it;
        this.size++;
    }

    @Override
    public Object dequeue()
    {
        if(isEmpty(this))
        {
            System.out.println("Queue is empty.");
            return null;
        }
        else
        {
            Object obj = this.array[this.front];
            this.front = (this.front +1 )%this.capacity;
            this.size --;
            return obj;
        }
    }

    @Override
    public int length()
    {
        int len = this.size;

        return len;
    }
}
