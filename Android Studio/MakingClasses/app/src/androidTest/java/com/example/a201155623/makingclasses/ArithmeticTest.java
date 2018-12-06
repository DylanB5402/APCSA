package com.example.a201155623.makingclasses;

import junit.framework.TestCase;

public class ArithmeticTest extends TestCase{

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
    }

    public void testArithmetic() {
        assertEquals(a.add(), 5.0);
        assertEquals(a.subtract(), -1.0);
        assertEquals(a.multiply(), 6.0);
        assertEquals(a.divide(), 2.0/3.0);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}

