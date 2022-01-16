class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            String res = "";
            for(int i = 0; i < K; i++){
                adj.add(new ArrayList<>());
            }
            for(int i = 0; i < N-1; i++){
                for(int j = 0; j < Math.min(dict[i].length(), dict[i+1].length()); j++){
                    if(dict[i].charAt(j) != dict[i+1].charAt(j)){
                        adj.get(dict[i].charAt(j) - 'a').add(dict[i+1].charAt(j) - 'a');
                        break;
                    }
                }
            }
            int indegree[] = new int[K];
            for(ArrayList<Integer> list : adj){
                for(int x : list){
                    indegree[x]++;
                }
            }
            
            Queue<Integer> queue = new LinkedList<>();
            for(int i = 0; i < K; i++){
                if(indegree[i] == 0) queue.add(i);
            }
            while(!queue.isEmpty()){
                int temp = queue.remove();
                res += (temp +'a');
                for(int x: adj.get(temp)){
                    indegree[x]--;
                    if(indegree[x] == 0){
                        queue.add(x);
                    }
                } 
            }
            return res;

        
    }
}
// https://practice.geeksforgeeks.org/problems/alien-dictionary/1/