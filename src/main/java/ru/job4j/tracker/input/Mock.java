package ru.job4j.tracker.input;

public class Mock implements Input {
    private String[] answersString;
    private int position = 0;

    public Mock(String[] answers) {
        this.answersString = answers;
    }

    @Override
    public String askStr(String question) {
        return answersString[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
