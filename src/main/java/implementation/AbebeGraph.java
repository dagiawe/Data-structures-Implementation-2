package implementation;

import java.util.List;

public interface AbebeGraph<V> {
    int getSize();

    List<V> getVertices();

    V getVertex(int index);

    int getIndex(V v);

    List<Integer> getNeighbors(int index);

    int getDegree(int v);

    void printEdges();

    void clear();

    boolean addVertex(V vertex);

    boolean addEdge(int u, int v);

    boolean addEdge(Edge e);

    boolean remove(V v);

    boolean remove(int u, int v);

    AbebeUnweightedGraph<V>.SearchTree dfs(int v);

    AbebeUnweightedGraph<V>.SearchTree bfs(int v);

    class Edge {
        int u;
        int v;

        public Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }

        public boolean equals(Object o) {
            return u == ((Edge) o).u && v == ((Edge) o).v;
        }
    }

    class WeightedEdge extends Edge
            implements Comparable<WeightedEdge> {
        public double weight;

        public WeightedEdge(int u, int v, double weight) {
            super(u, v);
            this.weight = weight;
        }

        @Override
        public int compareTo(WeightedEdge edge) {
            if (weight > edge.weight)
                return 1;
            else if (weight == edge.weight)
                return 0;
            else
                return -1;
        }
    }
}