class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        adj.get(c).remove((Integer)d);
        adj.get(d).remove((Integer)c);
        int vertices[] = new int[V];
        if(dfs(adj,c,d, vertices)){
            return 0;
        }
        return 1;
    }
    static boolean dfs(ArrayList<ArrayList<Integer>> adj,int target,int i,int vertices[]){
        if(i == target) return true;
        if(vertices[i] == 1) return false;
        vertices[i] = 1;
        boolean bool = false;
        for(int x: adj.get(i)){
            if(dfs(adj,target,x,vertices)){
                bool = true;
            }
        }
        return bool;
    }
}
// https://practice.geeksforgeeks.org/problems/bridge-edge-in-graph/1