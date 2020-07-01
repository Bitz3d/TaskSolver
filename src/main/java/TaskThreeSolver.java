import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.*;

public class TaskThreeSolver {

    public static Graph<Integer, DefaultEdge> generateGraph(List<List<Integer>> input) {
        Graph<Integer, DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);
        input.forEach(vertices -> {
            graph.addVertex(vertices.get(0));
            graph.addVertex(vertices.get(1));
            graph.addEdge(vertices.get(0), vertices.get(1));
        });
        return graph;
    }

    public static int numberOfConnections(Graph<Integer, DefaultEdge> graph) {
        ConnectivityInspector<Integer, DefaultEdge> connectivityInspector = new ConnectivityInspector<>(graph);
        return connectivityInspector.connectedSets().size();
    }
}
