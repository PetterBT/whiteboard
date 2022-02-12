package org.example.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnInput() {
        assertThat(calculator.add("69")).isEqualTo(0);
    }
}