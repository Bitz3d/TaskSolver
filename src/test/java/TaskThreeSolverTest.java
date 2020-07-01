import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskThreeSolverTest {

    private List<List<Integer>> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        list.add(Arrays.asList(1, 2));
        list.add(Arrays.asList(2, 3));
        list.add(Arrays.asList(5, 6));
    }

    @Test
    void generate_graph_should_have_five_vertices() {
        assertTrue(TaskThreeSolver.generateGraph(list).vertexSet().size() > 0);
    }

    @Test
    void generate_graph_should_have_three_edges() {
        assertTrue(TaskThreeSolver.generateGraph(list).edgeSet().size() > 0);
    }

    @Test
    void number_of_connections_should_have_two_connections() {
        Graph<Integer, DefaultEdge> graph = TaskThreeSolver.generateGraph(list);
        assertEquals(2, TaskThreeSolver.numberOfConnections(graph));
    }
}