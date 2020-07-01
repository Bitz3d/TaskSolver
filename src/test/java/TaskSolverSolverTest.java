import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class TaskSolverSolverTest {

    private List<Integer> integers;
    private List<Integer> distinctIntegers;
    private final int minListValue = 32;
    private final int maxListValue = 6546;

    @BeforeEach
    void setUp() {
        distinctIntegers = Arrays.asList(minListValue, 4645, 802, 100, maxListValue);
        integers = new ArrayList<>();
        integers.addAll(distinctIntegers);
        integers.addAll(Arrays.asList(minListValue, 4645, 802, 100, maxListValue));
    }

    @Test
    void find_max_value_should_return_max_value() {
        Assertions.assertEquals(TaskOneSolver.findMaxValue(integers), maxListValue);
    }

    @Test
    void find_max_value_should_return_null_pointer_exception_on_empty_list() {
        Assertions.assertThrows(NullPointerException.class, () -> TaskOneSolver.findMaxValue(Collections.emptyList()));
    }

    @Test
    void find_min_value_should_return_min_value() {
        Assertions.assertEquals(TaskOneSolver.findMinValue(integers), minListValue);
    }

    @Test
    void find_min_value_should_return_null_pointer_exception_on_empty_list() {
        Assertions.assertThrows(NullPointerException.class, () -> TaskOneSolver.findMaxValue(Collections.emptyList()));
    }

    @Test
    void count_should_return_number_of_element_in_list() {
        Assertions.assertEquals(TaskOneSolver.count(integers), integers.size());
    }

    @Test
    void count_should_return_zero_on_empty_list() {
        Assertions.assertEquals(TaskOneSolver.count(Collections.emptyList()), 0);
    }

    @Test
    void find_distinct_should_return_distinct_list() {
        Assertions.assertEquals(TaskOneSolver.findDistinct(integers), distinctIntegers.stream().sorted().collect(Collectors.toList()));
    }

}