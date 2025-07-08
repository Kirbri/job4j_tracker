package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> findOld(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPhone().contains(key) || person.getName().contains(key) || person.getSurname().contains(key)
                    || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine1 = person -> person.getPhone().contains(key);
        Predicate<Person> combine2 = person -> person.getName().contains(key);
        Predicate<Person> combine3 = person -> person.getSurname().contains(key);
        Predicate<Person> combine4 = person -> person.getAddress().contains(key);
        Predicate<Person> combineOr = combine1.or(combine2.or(combine3.or(combine4)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combineOr.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
