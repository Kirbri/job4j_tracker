package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
//        for (Suit s : Suit.values()) {
//            for (Value v : Value.values()) {
//                System.out.println(s + " " + v);
//            }
//        }

        Stream.of(Suit.values())
                .flatMap(suits -> Stream.of(Value.values())
                        .map(value -> suits + " " + value))
                .forEach(System.out::println);
    }
}