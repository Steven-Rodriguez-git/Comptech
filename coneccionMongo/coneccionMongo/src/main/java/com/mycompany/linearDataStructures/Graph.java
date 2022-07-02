package com.mycompany.linearDataStructures;
import java.util.*;

public class Graph<T> {

 // Java program to implement Graph
// with the help of Generics

	// We use Hashmap to store the edges in the graph
    public Map<T, List<T> > map = new Map<>();
        // This function adds a new vertex to the graph
	public void addVertex(T s)
	{
		map.add(s, new LinkedList<T>());
	}

	// This function adds the edge
	// between source to destination
	public void addEdge(T source,T destination,boolean bidirectional)
	{

		if (map.get(source)!=null){
                    addVertex(source);
                }

		if (map.get(destination)!=null){
			addVertex(destination);
                }

                System.out.println(source);
                //EL PROBLEMA ES EL MAPA QUE USO< ESE ES PARA GRAFOS
		map.get(source).add(destination);
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
	}

	// This function gives the count of vertices
	public void getVertexCount()
	{
		System.out.println("The graph has "+ map.keySet().length+ " vertex");
	}

	// This function gives the count of edges
	public void getEdgesCount(boolean bidirection)
	{
		int count = 0;
		for (String v :  map.keySet()) {
			count += map.get((T) v).size();
		}
		if (bidirection == true) {
			count = count / 2;
		}
		System.out.println("The graph has "
						+ count
						+ " edges.");
	}

	// This function gives whether
	// a vertex is present or not.
	public void hasVertex(T s)
	{
		if (map.get(s)!=null) {
			System.out.println("The graph contains "
							+ s + " as a vertex.");
		}
		else {
			System.out.println("The graph does not contain "
							+ s + " as a vertex.");
		}
	}

	// This function gives whether an edge is present or not.
	public void hasEdge(T s, T d)
	{
		if (map.get(s).contains(d)) {
			System.out.println("The graph has an edge between "
							+ s + " and " + d + ".");
		}
		else {
			System.out.println("The graph has no edge between "
							+ s + " and " + d + ".");
		}
	}

	// Prints the adjancency list of each vertex.
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();

		for (String v :  map.keySet()) {
			builder.append(v + ": ");
			for (T w : map.get((T) v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}

		return (builder.toString());
	}

// Java program to implement Graph
// with the help of Generics


	public static void main(String args[])
	{
		// Object of graph is created.
		Graph<Integer> g = new Graph<Integer>();

		// edges are added.
		// Since the graph is bidirectional,
		// so boolean bidirectional is passed as true.
		g.addEdge(0, 1, true);
		g.addEdge(0, 4, true);
		g.addEdge(1, 2, true);
		g.addEdge(1, 3, true);
		g.addEdge(1, 4, true);
		g.addEdge(2, 3, true);
		g.addEdge(3, 4, true);

		// Printing the graph
		System.out.println("Graph:\n"
						+ g.toString());

		// Gives the no of vertices in the graph.
		g.getVertexCount();

		// Gives the no of edges in the graph.
		g.getEdgesCount(true);

		// Tells whether the edge is present or not.
		g.hasEdge(3, 4);

		// Tells whether vertex is present or not
		g.hasVertex(5);
	}
}


        