package org.example;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    logic logic = new logic();

    @Test
    public void MulTwoNumbers()
    {
        long expectedMul = 24;
        long actualMul = logic.mul(4,6);
        Assertions.assertEquals(expectedMul,actualMul);
    }

    @Test
    public void MulTwoNumbersNeg()
    {
        long expectedMul = 23;
        long actualMul = logic.mul(4,6);
        Assertions.assertNotEquals(expectedMul,actualMul);
    }
}
