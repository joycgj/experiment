package com.joy.mockito.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void assertTrueAndFalseTest() {
        assertTrue(true);
        assertFalse(false);
    }

    @Test(expected = RuntimeException.class)
    public void testExeption() {
        throw new RuntimeException();
    }
}
