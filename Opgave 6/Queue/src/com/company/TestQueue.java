package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestQueue {

    @Test
    public void test_enqueue ()
    {
        Queue<Integer> testQ= new Queue<>(10);
        assertEquals(testQ.length(),0);

        testQ.enqueue(6);
        assertEquals(testQ.dequeue(),6);
    }

    @Test
    public void test_dequeue()
    {
        Queue<Integer> testQ= new Queue<>(10);
        testQ.enqueue(0);
        testQ.enqueue(1);
        testQ.enqueue(2);

        assertEquals(testQ.length(),3);

        testQ.dequeue();
        assertEquals(testQ.dequeue(),1);
        assertEquals(testQ.dequeue(),2);
        assertNull(testQ.dequeue());

    }
}
