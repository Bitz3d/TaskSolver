import java.util.*;

public class TaskTwoSolver {

    public static void findPairs(List<Integer> integers, int sum) {
        Map<Integer, Integer> pairs = new HashMap<>();
        Collections.sort(integers);
        integers.forEach(integer -> pairs.put(sum - integer, integer));
        integers.forEach(value -> {
            if (pairs.containsKey(value)) {
                System.out.println(value + " " + pairs.get(value));
                pairs.remove(pairs.get(value));
            }
        });
    }
}
