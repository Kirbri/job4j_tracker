package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0;
        int count = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }

        return (double) sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> averageByPupil = new ArrayList<>(pupils.size());

        for (Pupil pupil : pupils) {
            int sum = 0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
            averageByPupil.add(new Label(pupil.name(), (double) sum / count));
        }

        return averageByPupil;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Double> sumBySubject = new HashMap<>(pupils.size());
        List<Label> averageBySubject = new ArrayList<>(pupils.size());
        int count = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (sumBySubject.containsKey(subject.name())) {
                    count++;
                    double def = sumBySubject.getOrDefault(subject.name(), 0.0);
                    def += subject.score();
                    sumBySubject.put(subject.name(), def);
                } else {
                    count++;
                    sumBySubject.put(subject.name(), (double) subject.score());
                }
            }
        }
        count /= sumBySubject.size();

        for (Map.Entry<String, Double> subject : sumBySubject.entrySet()) {
            averageBySubject.add(new Label(subject.getKey(), (subject.getValue() / count)));
        }

        return averageBySubject;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        String name = null;
        double maxScore = 0;

        for (Pupil pupil : pupils) {
            double actualScore = 0;
            for (Subject subject : pupil.subjects()) {
                actualScore += subject.score();
            }
            if (actualScore > maxScore) {
                name = pupil.name();
                maxScore = actualScore;
            }
        }
        return new Label(name, maxScore);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Double> scoreBySubject = new HashMap<>(pupils.size());
        List<Label> subj = new ArrayList<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoreBySubject.put(subject.name(), scoreBySubject.getOrDefault(subject.name(), 0.0)
                        + subject.score());
            }
        }

        for (Map.Entry<String, Double> entry : scoreBySubject.entrySet()) {
            subj.add(new Label(entry.getKey(), entry.getValue()));
        }

        subj.sort(Comparator.naturalOrder());

        return subj.get(subj.size() - 1);
    }
}