// https://practice.geeksforgeeks.org/problems/prerequisite-tasks/1/
class Solution {
    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        int[] indegree = new int[N];
        for(int i = 0; i < N; i++){
            for(int x : adj.get(i)){
                indegree[x]++;
            }
            
        }
        
        // for(int i = 0; i < N; i++){
        //     System.out.println(indegree[i]);
        // }
        
        Queue<Integer> queue = new LinkedList<>();
        int time[] = new int[N];
        Arrays.fill(time,Integer.MAX_VALUE);
        for(int i = 0; i < N; i++){
            if(indegree[i] == 0){
                queue.add(i);
                time[i] = 1;
            }
        }
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            // System.out.println(node + "  " + time[node]);
            for(int x: adj.get(node)){
                indegree[x]-- ;
                if(indegree[x] == 0){
                    queue.add(x);
                    time[x] = time[node] + 1;
                }
            }
        }
        //   for(int i = 0; i < N; i++){
        //     System.out.println(time[i]);
        // }
        
        for(int i = 0; i < N; i++){
            if(time[i] == Integer.MAX_VALUE)
                return false;
        }
        return true;
    }
    
}