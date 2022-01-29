class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int indegree[] = new int[numCourses];
        ArrayList<ArrayList<Integer>> map = new ArrayList<>(numCourses);
        for(int i = 0; i < numCourses; i++){
            map.add(new ArrayList());
        }
        for(int[] arr : prerequisites){
            map.get(arr[1]).add(arr[0]);
            indegree[arr[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0) queue.add(i);
        }
        int count = 0;
        int res[] = new int[numCourses];
        while(!queue.isEmpty()){
            int k = queue.remove();
            res[count] = k;
            count++;
            for(int i : map.get(k)){
                indegree[i]--;
                if(indegree[i] == 0) queue.add(i);
            }
        }
        if(count < numCourses) return new int[0];
        return res;
    }
    
}
// https://leetcode.com/problems/course-schedule-ii/