import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.GrayFilter;

public class graphImpl {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int source, int destination, int weight){
            this.src = source;
            this.dest = destination;
            this.wt = weight;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){ //O(v+e)
        Queue<Integer> q = new LinkedList<>();
        boolean isVis[] = new boolean[graph.length];
        q.add(0); // source

        while (!q.isEmpty()) {
            int curr = q.remove();
            if(!isVis[curr]){
                System.out.println(curr+ " " );
                isVis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean isVis[]){
        System.out.println(curr);
        isVis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!isVis[e.dest]){
                dfs(graph, e.dest, isVis);
            }
        }

    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean isVis[]){
        if(src == dest) return true;
        isVis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!isVis[e.dest] && hasPath(graph, e.dest, dest, isVis)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];//array of arraylist which is empty and we will now fill it

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        //0 - vertex
        graph[0].add(new Edge(0, 1, 5));

        //1 - vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2 - vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //3 - vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4 - vertex
        graph[4].add(new Edge(4, 2, 2));

        // bfs(graph);
        dfs(graph, 0, new boolean[V]);
        System.out.println(hasPath(graph, 0, 4, new boolean[V]));
    }
}
