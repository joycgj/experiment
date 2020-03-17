package com.joy.mockito.lesson10;

import org.junit.Test;

import static com.joy.mockito.lesson10.CompareNumber.gt;
import static com.joy.mockito.lesson10.CompareNumber.lt;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTest {

    @Test
    public void test() {
        assertThat(10, gt(8));
        assertThat(10, lt(18));

        assertThat(12, both(gt(10)).and(lt(13)));
    }
}
