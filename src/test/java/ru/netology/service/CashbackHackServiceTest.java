package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainsIfAmountLessBoundary() {
       assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldNullIfAmountIsBoundary() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldNullIfAmountWithoutRemainderBoundary() {
        assertEquals(0, service.remain(2000));
    }

    @Test
    public void shouldNullIfAmountMoreBoundary() {
      assertEquals(999, service.remain(1001));
    }
}
