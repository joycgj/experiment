package com.joy.mockito.lesson03;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeepMockTest2 {

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private Lesson03Service lesson03Service;

    @Before
    public void init() {
        initMocks(this);
    }

    @Test
    public void testDeepMock() {
        Lesson03 lesson03 = lesson03Service.get();
        lesson03.foo();
    }
}
