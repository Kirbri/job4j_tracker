package ru.job4j.tracker;

public class MockInput implements Input {
    private String[] answersString;
    private int position = 0;

    public MockInput(String[] answers) {
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
