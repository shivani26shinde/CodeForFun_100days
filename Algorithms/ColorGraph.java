# Graph Coloring (n nodes, c colors)

import java.util.*;
import java.lang.*;
import java.io.*;

class Graph{
	class Edge{
		int v;
		public Edge(int v){
			this.v = v;
		}
		public String toString(){
			return ""+v;
		}
		
	}
	int[] color;
	int c = 3;
	List<Edge> array[];
	public Graph(int n){
		array = new LinkedList[n];
		color = new int[n];
		for(int i=0;i<n;i++){
			array[i] = new LinkedList<>();
		}
	}
	void addEdge(int u, int v){
		array[u].add(0, new Edge(v)); // Time complexity to add at the begining of LL is O(1)
		array[v].add(0, new Edge(u));
	}
	boolean isConnected(int u, int v){
		if(array[u] == null || array[v] == null){
			return false;
		}
		for(Edge i:array[u]){
			if(i.v == v){
				return true;
			}
		}
		for(Edge i:array[v]){
			if(i.v == u){
				return true;
			}
		}
		return false;
	}
	void markColor(int k){
		for(int i=0;i<c;i++){
			if(isSafe(k,i) == true){
				color[k] = i;
				if(k+1 < array.length){
					markColor(k+1);
				}
				else{
					return;
				}
			}
		}
	}
	boolean isSafe(int k, int c){
		for(int i=0;i<array.length;i++){
			if(isConnected(k, i) == true && color[i] == c){
				return false;
			}
		}
		return true;
	}
	public String toString(){
		String res = "";
		for(int i=0;i<array.length;i++){
			res = res + i + "--->" + array[i] +"\n";
		}
		return res;
	}
}

class ColorGraph{
	public static void main (String[] args) throws java.lang.Exception
	{
		Graph g = new Graph(4);
		g.addEdge(0,1); g.addEdge(0,3); g.addEdge(1,2); g.addEdge(1,3);
		g.addEdge(2,3);
		//System.out.println(g);
		g.markColor(0);
		System.out.println(Arrays.toString(g.color));
		
	}
}