import java.util.ArrayList;
import java.util.Random;

public class WeightedGraph implements Graph {

    private static String[] names = parsePossibleNames();
    private double[][] adjacencyMatrix;
    private Random rand;
    private ArrayList<Vertex> graph = new ArrayList<Vertex>();

    public WeightedGraph(double[][] adjacencyMatrix) {
        rand = new Random();
    }

}
