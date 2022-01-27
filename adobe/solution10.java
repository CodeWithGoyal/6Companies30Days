class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> map = new HashMap<>();
        int maxVotes = 0;
        String res[] = new String[2];
        for(String str : arr){
            map.put(str, map.getOrDefault(str,0) + 1);
            if(map.get(str) > maxVotes){
                res[0] = str;
                res[1] = String.valueOf(map.get(str));
                maxVotes = map.get(str);
            }
            else if(map.get(str) == maxVotes && res[0].compareTo(str) > 0){
                res[0] = str;
            }
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/