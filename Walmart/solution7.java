class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[n];
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr.get(stack.peek()) < arr.get(i)){
                nextGreater[stack.pop()] = i;
            }
            stack.push(i);
        }
        for(int i = 0; i < n; i++){
            if(nextGreater[i] > i && nextGreater[nextGreater[i]] > nextGreater[i]){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(arr.get(i));
                res.add(arr.get(nextGreater[i]));
                res.add(arr.get(nextGreater[nextGreater[i]]));
                return res;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        return res;
    }   
}

// https://practice.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/1/