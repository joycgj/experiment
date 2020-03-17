package com.joy.mockito.lesson03;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeepMockTest {

    @Mock
    private Lesson03Service lesson03Service;

    @Mock
    private Lesson03 lesson03;

    @Before
    public void init() {
        initMocks(this);
    }

    @Test
    public void testDeepMock() {
        when(lesson03Service.get()).thenReturn(lesson03);
        Lesson03 lesson03 = lesson03Service.get();
        lesson03.foo();
    }
}
