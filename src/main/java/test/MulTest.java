package test;

import org.example.logic;
//import org.example.Multiply;
import org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class MulTest {
    @Autowired
    logic logic;

    @Test
    public void MulTwoNumbers()
    {
        long expectedMul = 24;
        long actualMul = logic.mul(4,6);

        assertEquals(expectedMul, actualMul);

    }
}
