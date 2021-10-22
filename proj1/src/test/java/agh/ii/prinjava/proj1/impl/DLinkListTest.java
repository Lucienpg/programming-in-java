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

    /**
     * we must see and expected 56 because its change the order
     */
    @Test
    void addfirst(){
        dLinkList.addFirst(56);
        Assertions.assertEquals(56, dLinkList.returnFirst());
    }

    /**
     * we must see 32 as it works, because it is the last we put
     */
    @Test
    void addLast(){
        dLinkList.addLast(32);
        Assertions.assertEquals(32, dLinkList.returnlast());
    }

    /**
     * Here we expect 1 because: at the beginning it is 2 in first order but it change after we put 1
     * in the first position. So 2 is removed and we expected 1
     */
    @Test
    void removelast(){
        dLinkList.removeLast();
        Assertions.assertEquals(1, dLinkList.returnlast());

    }
    @AfterEach
    void tearDown() {

    }
}