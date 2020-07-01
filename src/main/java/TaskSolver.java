import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

import java.util.*;
import java.util.stream.Collectors;

public class TaskSolver {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the task you want to solve.");
        System.out.println("Write - 1 to solve task 1. Write - 2 to solve task 2. Write - 3 to solve task 3");
        String taskToSolveNumber = scanner.nextLine();

        if ("1".equals(taskToSolveNumber)) {
            List<Integer> integers = getIntegers(scanner, "Write list of integers space separated.");
            printTaskOneResult(integers);
        } else if ("2".equals(taskToSolveNumber)) {
            List<Integer> integers = getIntegers(scanner, "Write list of integers space separated.");
            int sum = 13;
            TaskTwoSolver.findPairs(integers, sum);
        } else if ("3".equals(taskToSolveNumber)) {
            List<List<Integer>> list = new ArrayList<>();
            System.out.println("Please write how many positive integer");
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                list.add(getIntegers(scanner, "Write two integers space separated."));
            }
            Graph<Integer, DefaultEdge> graph = TaskThreeSolver.generateGraph(list);
            System.out.println(TaskThreeSolver.numberOfConnections(graph));
        } else {
            System.out.println("Please play with the rules!");
        }
    }

    private static void printTaskOneResult(List<Integer> integers) {
        System.out.println(TaskOneSolver.findDistinct(integers)
                .stream().map(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println("count: " + TaskOneSolver.count(integers));
        System.out.println("distinct: " + TaskOneSolver.findDistinct(integers).size());
        System.out.println("min: " + TaskOneSolver.findMinValue(integers));
        System.out.println("max: " + TaskOneSolver.findMaxValue(integers));
    }

    private static List<Integer> getIntegers(Scanner scanner, String message) throws Exception {
        System.out.println(message);
        String inputString = scanner.nextLine();
        List<Integer> collect;
        try {
            collect = Arrays.stream(inputString.split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new Exception("Please play with the rules");
        }
        return collect;
    }
}
