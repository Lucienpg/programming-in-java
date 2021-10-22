package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(34);
    }

    @Test
    void TestEnqueue(){
        Assertions.assertEquals(4,queueOfInts.peek());
    }

    @Test
    void testDequeu(){
        queueOfInts.dequeue();
        Assertions.assertEquals(34, queueOfInts.returnFisrtQ());
    }

    @AfterEach
    void tearDown() {
    }
}