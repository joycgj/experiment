package com.joy.mockito.study;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.when;

public class MockitoAnnotationsUninitializedUnitTest {

    @Mock
    List<String> mockedList;

    @Test(expected = NullPointerException.class)
    public void whenMockitoAnnotationsUninitialized_thenNPEThrown() {
        when(mockedList.size()).thenReturn(1);
    }
}
