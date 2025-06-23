package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void whenComparatorDescByNameAndDescByPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByPriorityAndDescByName() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug1", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscByName = new JobAscByName();
        int rsl = cmpAscByName.compare(
                new Job("Abc task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpAscByName = new JobDescByName();
        int rsl = cmpAscByName.compare(
                new Job("Fix bug", 100),
                new Job("Queue task", -10)

        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpAscByName = new JobDescByPriority();
        int rsl = cmpAscByName.compare(
                new Job("Fix bug", 100),
                new Job("Queue task", -10)

        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscByName = new JobAscByPriority();
        int rsl = cmpAscByName.compare(
                new Job("Queue bug", 0),
                new Job("Queue task", -10)

        );
        assertThat(rsl).isGreaterThan(0);
    }
}
