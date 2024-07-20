package ru.job4j.oop;

public class College {
    Freshman freshman = new Freshman();
    Student studentFromFreshman = freshman;
    Object objectFromStudent = studentFromFreshman; /* up casting */

    Object object = new Object();
    Student studentFromObject = (Student) object;
    Freshman freshmanFromStudent = (Freshman) studentFromObject;
}
