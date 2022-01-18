/*Complete the given function
Node is as follows:
class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}*/

class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code here
	    Queue<Node> queue = new LinkedList<>();
	    queue.add(root);
	    while(!queue.isEmpty()){
	        Node node = queue.remove();
	        if(node == null) A.add(-1);
	        else{
	            A.add(node.data);
	            queue.add(node.left);
	            queue.add(node.right);
	        } 
	    }
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        if(A.size() == 0) return null;
        Node root = new Node(A.get(0));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(i < A.size()){
            Node node = queue.remove();
            node.left = A.get(i) == -1?null: new Node(A.get(i));
            i++;
            if(i < A.size()){
                 node.right = A.get(i) == -1?null: new Node(A.get(i));
                i++;
            }
            if(node.left != null)queue.add(node.left);
            if(node.right!= null)queue.add(node.right);
        }
        return root;
    }
};
// https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1