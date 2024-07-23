package ru.job4j.tracker.input;

import ru.job4j.tracker.output.Output;

public class ValidateInput implements Input {
    private final Output output;
    private final Input input;

    public ValidateInput(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }


    /* Использование метода заменили на выброс исключения
    private boolean isNumber(String value) {
        boolean result = true;
        char[] check = value.toCharArray();
        for (char number : check) {
            if (number < 48 || number > 57) {
                result = false;
                break;
            }
        }
        return result;
    }
     */

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                String result = input.askStr(question);
                value = Integer.parseInt(result);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }
}
