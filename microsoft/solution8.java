/*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    
    class Solution
    {
        //Function to connect nodes at same level.
        public void connect(Node root)
        {
            // Your code goes here.
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                // Node node = queue.remove();
                for(int i = 0; i < size ; i++){
                    Node temp = queue.remove();
                    if (i != size - 1)
                        temp.nextRight = queue.peek();
                    else{
                        temp.nextRight = null;
                    }
                    if(temp.left != null) queue.add(temp.left);
                    if(temp.right != null) queue.add(temp.right);
                }
                // node.nextRight = null;
            }
        }
    }
    // https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1/