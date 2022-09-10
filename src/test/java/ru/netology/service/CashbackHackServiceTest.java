package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {

    public CashbackHackService service = new CashbackHackService();

    @Test
    public void cashbackLessBoundary() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void cashbackEqualBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
}
