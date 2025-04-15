# 📘Kruskal’s Algorithm (Java)

## 📌 Overview

**Kruskal’s Algorithm** is a **Greedy Algorithm** used to find the **Minimum Spanning Tree (MST)** of a connected, weighted, undirected graph.

The MST connects all vertices with the **minimum total edge weight** and **no cycles**.

---

## 🚀 Algorithm Used

**Greedy Algorithm**

### Strategy:

1. Sort all edges in increasing order of weight
2. Pick the smallest edge
3. Include it if it doesn’t form a cycle
4. Repeat until `V − 1` edges are selected

Cycle detection is efficiently handled using **Disjoint Set Union (Union–Find)**.

---

## 🧮 Time and Space Complexity

* **Time Complexity:** `O(E log E)`
* **Space Complexity:** `O(V)`

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or terminal

---

## 📂 Project Structure

```
KruskalsAlgorithm.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

   ```bash
   javac KruskalsAlgorithm.java
   ```
2. Run the program:

   ```bash
   java KruskalsAlgorithm
   ```

---

## ⌨️ Sample Input

```
Enter number of vertices: 4
Enter number of edges: 5
Enter src, dest, weight:
0 1 10
0 2 6
0 3 5
1 3 15
2 3 4
```

---

## ✅ Sample Output

```
Edges in Minimum Spanning Tree:
2 - 3 : 4
0 - 3 : 5
0 - 1 : 10
Total weight of MST: 19
```

---

## 🧠 Key Concepts

* Greedy Algorithms
* Disjoint Set (Union-Find)
* Minimum Spanning Tree
* Graph Algorithms

---

## 🔧 Customization Ideas

* Convert to adjacency list input
* Visualize MST edges
* Add menu-driven graph algorithms
* Compare with Prim’s Algorithm

---

## 📚 Applications

* Network design
* Circuit design
* Clustering
* Approximation algorithms

---

## 📝 License

Free to use for academic, learning, and interview preparation.

