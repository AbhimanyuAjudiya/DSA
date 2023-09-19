import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public static void bfs(ArrayList<Edge>[] graph){
        boolean isVis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!isVis[i]){
                bfsUtil(graph, isVis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] isVis){ //O(v+e)
        Queue<Integer> q = new LinkedList<>();
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


    public static void dfs(ArrayList<Edge>[] graph){
        boolean isVis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {   
            if(!isVis[i]){
                dfsUtil(graph, i, isVis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean isVis[]){
        System.out.println(curr);
        isVis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!isVis[e.dest]){
                dfsUtil(graph, e.dest, isVis);
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

    public static boolean dectectCycleInUnDirGraph(ArrayList<Edge>[] graph){
        boolean isVis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!isVis[i]){
                if(dectectCycleUtil(graph, isVis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dectectCycleUtil(ArrayList<Edge>[] graph, boolean isVis[], int curr, int parent){
        isVis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!isVis[e.dest]){
                if(dectectCycleUtil(graph, isVis, e.dest, curr)){
                    return true;
                }
            }
            else if(isVis[e.dest] && e.dest != parent){
                return true;
            }
        }
        return false;
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int col[] = new int[graph. length];
        for(int i=0; i<col.length; i++) {
            col[i] = -1; //no color
        }
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<graph.length; i++) {
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if(col[e.dest] == col[curr]){
                            return false;
                        }

                    }
                }
            } //BFS
        }
        return true;
        
    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack){
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            } else if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void topShortDfs(ArrayList<Edge>[] graph){
        boolean isVis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if(!isVis[i]){
                topShortUtil(graph, i, isVis, s);
            }
        }
        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void topShortUtil(ArrayList<Edge>[] graph, int curr, boolean[] isVis, Stack s){
        isVis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!isVis[e.dest]){
                topShortUtil(graph, e.dest, isVis, s);
            }
        }
        s.push(curr);
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
        // dfs(graph, 0, new boolean[V]);
        // System.out.println(hasPath(graph, 0, 4, new boolean[V]));
        System.out.println(dectectCycleInUnDirGraph(graph));
    }
}
