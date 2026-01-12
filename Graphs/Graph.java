package Graphs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph{
	private LinkedList<Integer> edges[];
	
	Graph(int v){
		edges=new LinkedList[v];
		
		for(int i=0; i<edges.length; i++) {
			edges[i] = new LinkedList<>();
		}
	}
	
	void addEnd(int source, int destination) {
		edges[source].add(destination);
		edges[destination].add(source);
	}
	
	void bfs(int source) {
		boolean visited[] = new boolean[edges.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		visited[source]=true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr+" ");
			
			for(int neighbor:edges[curr]) {
				if(!visited[neighbor]) {
					visited[neighbor]=true;
					q.add(neighbor);
				}
			}
		}
		System.out.println();
	}
	
	void dfs(int source) {
		boolean visited[] = new boolean[edges.length];
		Stack<Integer> st = new Stack<>();
		
		st.push(source);
		visited[source]=true;
		
		
		while(!st.isEmpty()) {
			int curr= st.pop();
			
			System.out.print(curr+" ");
			
			for(int neighbor: edges[curr]) {
				if(!visited[neighbor]) {
					visited[neighbor]=true;
					st.push(neighbor);
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Graph gh = new Graph(4);
        gh.addEnd(0, 1);
        gh.addEnd(0, 2);
        gh.addEnd(1, 3);
        gh.bfs(0);
        gh.dfs(0);
	}
}
