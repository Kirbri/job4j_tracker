package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException() {
        super("The element is missing from the string array");
    }

}
