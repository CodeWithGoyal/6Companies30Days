//User function Template for Java

/*
delete n nodes after m nodes
The input list will have at least one element  
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node curr = head;
        while(curr != null){
            for(int i = 0; i < M - 1 && curr!= null ; i++){
                curr = curr.next;
            }
            if(curr == null || curr.next == null) return ;
            for(int  i = 0; i < N && curr.next != null; i++){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
    }
}

// https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1/