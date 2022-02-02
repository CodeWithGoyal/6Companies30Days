class Solution{
    // Node prev = null;
    int toSum(Node root){
        if(root == null) return 0;
        int i =  root.data;
        root.data = toSum(root.left) + toSum(root.right);
        return root.data + i;
        
    }
    public void toSumTree(Node root){
         //add code here.
         if(root == null) return ;
         
         this.toSum(root);
         
         
    }
}
// https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1/