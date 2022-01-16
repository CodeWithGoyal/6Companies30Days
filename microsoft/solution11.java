class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> res = new ArrayList();
        Queue<String> queue = new LinkedList();
        queue.add("1");
        for(int i = 1; i <= N; i++){
            String str = queue.remove();
            res.add(str);
            queue.add(str+'0');
            queue.add(str+'1');
        }
        return res;
    }
    
}

// https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1/