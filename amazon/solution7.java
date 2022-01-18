class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < A.length(); i++){
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i), 0) + 1);
            if(map.get(A.charAt(i)) == 1)
                queue.add(A.charAt(i));
            while(!queue.isEmpty() && map.get(queue.peek()) > 1){
                queue.remove();
            }
            if(queue.isEmpty()){
                res.append("#");
            } else{
                res.append(queue.peek());
            }
        }
        return res.toString();
    }
}
// https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1