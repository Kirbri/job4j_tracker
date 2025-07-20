package ru.job4j.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByNameOld() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.findOld("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenNotFindOld() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Kukuev", "2341211", "Kaluga")
        );
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")

        );
        var persons = phones.findOld("Nikola");
        assertThat(persons).isEmpty();
    }

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }
}