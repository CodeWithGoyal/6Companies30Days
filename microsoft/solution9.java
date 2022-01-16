//User function Template for Java


/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/


class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
    int count;
    int countSubtreesWithSumX(Node root, int X)
    {
	//Add your code here.
	    count = 0;
	    helper(root,X);
	    return count;
    }
    int helper(Node root, int target){
        if(root == null) return 0;
        // if(root.left == null && root.right == null){
        //     if(root.data == target) count++;
        //     return root.data;
        // }
        int sum = root.data;
        sum += helper(root.left,target) + helper(root.right, target);
        if(sum == target) count++;
        return sum;
    }
}

// https://practice.geeksforgeeks.org/problems/count-number-of-subtrees-having-given-sum/1/