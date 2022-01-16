// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < string_list.length; i++){
            char[] s = string_list[i].toCharArray();
            Arrays.sort(s);
            String str = String.valueOf(s);
            if(map.containsKey(str)){
                List<String> temp = new ArrayList<>(map.get(str));
                temp.add(string_list[i]);
                map.put(str,new ArrayList<>(temp));
            }
            else{
                map.put(str,Arrays.asList(string_list[i]));
            }
        }
        
        for(int i = 0; i < string_list.length; i++){
            char[] s = string_list[i].toCharArray();
            Arrays.sort(s);
            String str = String.valueOf(s);
            if(map.containsKey(str)){
                res.add(map.get(str));
                map.remove(str);
            }
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1