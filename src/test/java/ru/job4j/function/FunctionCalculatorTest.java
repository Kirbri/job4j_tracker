package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(3, 7, x -> x * x - 5 * x + 1.76);
        List<Double> expected = Arrays.asList(-4.24, -2.24, 1.76, 7.76);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenIndicativeFunctionThenIndicativeResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(0, 4, x -> Math.pow(3, x) - x * 56);
        List<Double> expected = Arrays.asList(1.0, -53.0, -103.0, -141.0);
        assertThat(result).containsAll(expected);
    }
}