package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        dLinkList.addFirst(2);
        dLinkList.addFirst(1);
    }

    @Test
    void addfirst(){
        dLinkList.addFirst(56);
        Assertions.assertEquals(56, dLinkList.returnFirst());
    }

    @Test
    void addLast(){
        dLinkList.addLast(32);
        Assertions.assertEquals(32, dLinkList.returnlast());
    }
    @AfterEach
    void tearDown() {

    }
}