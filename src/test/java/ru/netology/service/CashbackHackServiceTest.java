package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainsIfAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldNullIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertEquals(0, service.remain(1000));
    }
}
