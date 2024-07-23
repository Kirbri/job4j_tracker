package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"0"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
    }

    @Test
    void whenValidInputMore() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"0", "1", "2"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected0 = input.askInt("Enter menu:");
        assertThat(selected0).isEqualTo(0);
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(1);
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(2);
    }

    @Test
    void whenInvalidMinusInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-1", "-10"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selectedMinus1 = input.askInt("Enter menu:");
        assertThat(selectedMinus1).isEqualTo(-1);
        int selectedMinus10 = input.askInt("Enter menu:");
        assertThat(selectedMinus10).isEqualTo(-10);
    }
}