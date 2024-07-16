package ru.job4j.record;

public record PersonRecord(String name, int age) implements Comparable<PersonRecord> {
    public static int maxAge = 100;

    public PersonRecord(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public void info() {
        System.out.println("Напечатать информацию");
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }

    @Override
    public int compareTo(PersonRecord o) {
        return name.compareTo(o.name);
    }
}
