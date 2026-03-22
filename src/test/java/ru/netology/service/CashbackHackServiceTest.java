package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        // В JUnit 5 порядок: (Expected, Actual)
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}