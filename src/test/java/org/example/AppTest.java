package org.example;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class AppTest {
    logic logic = new logic();

    @Test
    public void PositiveTest()
    {
        long expectedMul = 24;
        long actualMul = logic.mul(4,6);
        Assertions.assertEquals(expectedMul,actualMul);
    }

    @Test
    public void NegativeTest()
    {
        long expectedMul = 23;
        long actualMul = logic.mul(4,6);
        Assertions.assertNotEquals(expectedMul,actualMul);
    }
}
