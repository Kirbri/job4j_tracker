package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /* for-each origin -> new HashSet. */
        for (String word : origin) {
            check.add(word);
        }
        /* for-each text -> hashSet.contains */
        for (String word : text) {
            if (!check.contains(word)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
