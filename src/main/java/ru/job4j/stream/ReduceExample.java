package ru.job4j.stream;

import ru.job4j.record.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        Optional<Integer> sum1 = numbers.stream()
                .reduce((left, right) -> left + right);
        System.out.println(sum1.get());

        List<String> nums1 = List.of("Один", "Два", "Три");
        Optional<String> sum2 = nums1.stream()
                .reduce((left, right) -> left + ", " + right);
        System.out.println(sum2.get());

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4);
        int sum = nums2.stream()
                .reduce(2, (left, right) -> left + right);
        System.out.println(sum);

        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum3 = people.stream()
                .reduce(
                        0,
                        (left, right) -> {
                            if (right.getAge() > 25) {
                                return left + right.getAge();
                            } else {
                                return left;
                            }
                        },
                        (left, right) -> left + right
                );
        System.out.println(sum3);

        int min = people.parallelStream()
                .reduce(
                        0,
                        (left, right) -> left + right.getAge(),
                        Integer::min
                );
        System.out.println(min);
    }
}