// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;
 
// This class represents a directed graph using adjacency list
// representation
class Graph
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List Represntation
 
    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
 
    // A recursive function that uses visited[] and parent to detect
    // cycle in subgraph reachable from vertex v.
    Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {
        // Mark the current node as visited
        visited[v] = true;
        Integer i;
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
 
            // If an adjacent is not visited, then recur for that
            // adjacent
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }
 
            // If an adjacent is visited and not parent of current
            // vertex, then there is a cycle.
            else if (i != parent)
                return true;
        }
        return false;
    }
 
    // Returns true if the graph contains a cycle, else false.
    Boolean isCyclic()
    {
        // Mark all the vertices as not visited and not part of
        // recursion stack
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        // Call the recursive helper function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++)
            if (!visited[u]) // Don't recur for u if already visited
                if (isCyclicUtil(u, visited, -1))
                    return true;
 
        return false;
    }

}

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
		int t = in.nextInt();
// 		System.out.println("t= " + t);
		for (int i=0; i<t; i++){
		    int n = in.nextInt();
		  //  System.out.println("n= " + n);
		    Graph g = new Graph(n);
		    
		    int m = in.nextInt();
		  //  System.out.println("m= " + m);
		   	for (int j=0; j<m; j++){
		   	    int a = in.nextInt();
		   	    int b = in.nextInt();
		   	  //  System.out.println("a,b= " + a +","+b);
		   	    g.addEdge(a, b);
		   	}
		    if (g.isCyclic())
                System.out.println(1);
            else
                System.out.println(0);
		}
        
    }
}