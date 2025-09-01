package com.alanjam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(2, calc.add(1, 1));
    }
}
