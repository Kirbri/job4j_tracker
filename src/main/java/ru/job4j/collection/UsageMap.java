package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("kirbri@yandex.ru", "K. A. A.");
        hashmap.put("parsentev@yandex.ru", "Petr Arsentev");
        hashmap.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");

        for (String key : hashmap.keySet()) {
            String value = hashmap.get(key);
            System.out.println("Key = " + key + ", value = " + value);
        }
    }
}
