package com.joy.mockito.verify00;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.class)
public class VerifyTest {

    @Test
    public void test00() {
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        verify(mockedList).size();
    }

    @Test
    public void test01() {
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        mockedList.clear();
        verify(mockedList).size();
        verify(mockedList).clear();
        verifyNoMoreInteractions(mockedList);
    }

    @Test
    public void test02() {
        List<String> mockedList = mock(MyList.class);
        mockedList.add("test");
        verify(mockedList).add(anyString());
    }
}
