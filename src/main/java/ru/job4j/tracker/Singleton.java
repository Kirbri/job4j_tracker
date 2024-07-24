package ru.job4j.tracker;

public class Singleton {
    private static Singleton instance = null; /* <- ссылка на единственный объект класса Singleton */

    private Singleton() { /* <- явно создаем закрытый конструктор. */
    }

    public static Singleton getInstance() { /* <- статический метод. Он используется для публикации ссылки. */
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
