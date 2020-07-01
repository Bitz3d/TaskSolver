import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTwoSolverTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final List<Integer> A = Arrays.asList(1, -1, 14, 2, 10, 7, 5, 3, 6, 6, 6, 13, 0, 113, -100);
    int sum = 13;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void find_pairs_print_all_numbers_that_sum_to_thirteen() {
        TaskTwoSolver.findPairs(A, sum);
        assertEquals("-100 113\n" +
                "-1 14\n" +
                "0 13\n" +
                "3 10\n" +
                "6 7\n" +
                "6 7\n" +
                "6 7\n", outContent.toString());
    }

}