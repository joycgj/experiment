package com.joy.mockito.lesson03;

import com.joy.mockito.common.Account;
import com.joy.mockito.common.AccountDao;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

public class MockByAnnotationTest {

    @Before
    public void init() {
        initMocks(this);
    }

    @Mock(answer = Answers.RETURNS_SMART_NULLS)
    private AccountDao accountDao;

    @Test
    public void testMock() {
        Account account = accountDao.findAccount("x", "x");
        System.out.println(account);
    }
}
