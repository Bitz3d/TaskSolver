import java.util.List;
import java.util.stream.Collectors;

public class TaskOneSolver {

    public static int findMaxValue(List<Integer> integers) {
        return integers.stream().max(Integer::compareTo).orElseThrow(NullPointerException::new);
    }

    public static int findMinValue(List<Integer> integers) {
        return integers.stream().min(Integer::compareTo).orElseThrow(NullPointerException::new);
    }

    public static List<Integer> findDistinct(List<Integer> integers) {
        return integers.stream().sorted().distinct().collect(Collectors.toList());
    }

    public static int count(List<Integer> integers) {
        return integers.size();
    }


}
