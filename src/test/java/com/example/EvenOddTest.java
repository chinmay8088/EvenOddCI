
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {

    @Test
    public void testEvenNumber() {
        assertTrue(EvenOdd.isEven(8));
    }

    @Test
    public void testOddNumber() {
        assertFalse(EvenOdd.isEven(7));
    }

    @Test
    public void testZero() {
        assertTrue(EvenOdd.isEven(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertTrue(EvenOdd.isEven(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        assertFalse(EvenOdd.isEven(-3));
    }
}
