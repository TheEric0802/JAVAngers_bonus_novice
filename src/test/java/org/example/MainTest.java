package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isGreaterThanZero_shouldReturnTrue_WhenValueIs2() {
        assertTrue(Main.isGreaterThanZero(2));
    }

    @Test
    void isGreaterThanZero_shouldReturnFalse_WhenValueIs0() {
        assertFalse(Main.isGreaterThanZero(0));
    }

    @Test
    void isGreaterThanZero_shouldReturnFalse_WhenValueIsNegative10() {
        assertFalse(Main.isGreaterThanZero(-10));
    }

    @Test
    void square_shouldReturn25_WhenValueIs5() {
        assertEquals(25, Main.square(5));
    }
}