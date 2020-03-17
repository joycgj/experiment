package com.joy.mockito.quickstart;

import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AssumptionTest {

    boolean isSonarRunning = false;

    @Test
    public void very_critical_test() {
        isSonarRunning = false;
        Assume.assumeFalse(isSonarRunning);
        assertTrue(true);
    }
}
