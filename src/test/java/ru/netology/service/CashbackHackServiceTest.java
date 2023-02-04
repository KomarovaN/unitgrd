package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainsIfAmountLessBoundary() {
       Assertions.assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldNullIfAmountIsBoundary() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldNullIfAmountWithoutRemainderBoundary() {
        Assertions.assertEquals(0, service.remain(2000));
    }

    @Test
    public void shouldNullIfAmountMoreBoundary() {
       Assertions.assertEquals(999, service.remain(1001));
    }
}
