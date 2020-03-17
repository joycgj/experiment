package com.joy.mockito.quickstart;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExecutionOrder {
    @Test
    public void edit() {
        System.out.println("edit");
    }

    @Test
    public void create() {
        System.out.println("create");
    }

    @Test
    public void remove() {
        System.out.println("remove");
    }
}
