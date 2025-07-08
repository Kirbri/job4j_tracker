package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByNameOld() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.findOld("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenNotFindOld() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Kukuev", "2341211", "Kaluga")
        );
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")

        );
        ArrayList<Person> persons = phones.findOld("Nikola");
        assertThat(persons).isEmpty();
    }

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }
}