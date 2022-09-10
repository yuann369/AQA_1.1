package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJUnitJupiterTest {
    public CashbackHackService service = new CashbackHackService();

    @Test
    public void cashbackLessBoundaryJUnitJupiter() {
        int actual = service.remain(900);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void cashbackEqualBoundaryJUnitJupiter() {
        int actual = service.remain(1000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
}
