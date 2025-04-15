import java.util.Arrays;
import java.util.Scanner;

// Edge representation
class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

// Disjoint Set (Union-Find)
class DisjointSet {
    int[] parent, rank;

    DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++)
            parent[i] = i;
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]); // path compression
        return parent[x];
    }

    void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY)
            return;

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }
}

public class Kruskal{

    static void kruskal(int vertices, Edge[] edges) {

        // Sort edges by increasing weight
        Arrays.sort(edges, (a, b) -> a.weight - b.weight);

        DisjointSet ds = new DisjointSet(vertices);

        int mstWeight = 0;
        int edgeCount = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (Edge edge : edges) {
            if (edgeCount == vertices - 1)
                break;

            int x = ds.find(edge.src);
            int y = ds.find(edge.dest);

            // If including this edge doesn't form a cycle
            if (x != y) {
                ds.union(x, y);
                mstWeight += edge.weight;
                edgeCount++;
                System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
            }
        }

        System.out.println("Total weight of MST: " + mstWeight);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        Edge[] edges = new Edge[E];

        for (int i = 0; i < E; i++) {
            System.out.print("Enter src, dest, weight: ");
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            edges[i] = new Edge(src, dest, weight);
        }

        kruskal(V, edges);
        sc.close();
    }
}
