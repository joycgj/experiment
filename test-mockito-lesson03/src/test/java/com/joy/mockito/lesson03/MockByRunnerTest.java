package com.joy.mockito.lesson03;

import com.joy.mockito.common.Account;
import com.joy.mockito.common.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.RETURNS_SMART_NULLS;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MockByRunnerTest {

    @Test
     public void testMock() {
        AccountDao accountDao = mock(AccountDao.class, RETURNS_SMART_NULLS);
        Account account = accountDao.findAccount("x", "x");
        System.out.println(account);
     }
}
