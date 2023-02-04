package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainsIfAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldNullIfAmountBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(0, service.remain(1000));
    }
}
