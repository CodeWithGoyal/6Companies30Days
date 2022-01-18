class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    static int res;
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        res = 0;
        height(root,target);
        return res;
    }
    public static int height(Node root,int target){
        if(root == null) return 0;
        int lheight = height(root.left,target) + 1;
        int rheight = height(root.right, target) + 1;
        if(root.data == target){
            res = Math.max(res,Math.max(lheight,rheight)-1);
        }
        else{
            int distl = distFromTarget(root.left,target) + 1;
            int distr = distFromTarget(root.right, target) + 1;
            if(distl < 100000){
                res = Math.max(res,distl + rheight-1);
            }
            else if (distr < 100000){
                res = Math.max(res, distr + lheight-1);
            }
            
        }
        return Math.max(lheight,rheight);
        
    }
    public static int distFromTarget(Node root , int target){
        if(root == null) return 1000000;
        if(root.data == target) return 0;
        return Math.min(distFromTarget(root.left,target)+1, distFromTarget(root.right,target) + 1);
    }
}.
// https://practice.geeksforgeeks.org/problems/burning-tree/1/