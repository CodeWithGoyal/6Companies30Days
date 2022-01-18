class Solution{
    static class TrieNode{
        TrieNode children[];
        boolean isEnd;
        TrieNode(){
            children = new TrieNode[26];
            isEnd = false;
        }
    }
    static void insert(String str,TrieNode node){
        TrieNode curr = node;
        for(char c : str.toCharArray()){
            if(curr.children[c -'a'] == null){
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isEnd = true;
    }
    static TrieNode prefixSearch(String str, TrieNode node){
        if(node == null) return null;
        TrieNode curr = node;
        for(char c : str.toCharArray()){
            if(curr.children[c - 'a'] != null){
                curr = curr.children[c - 'a'];
            }
            else{
                return null;
            }
        }
        return curr;
    }
    static void wordSearch(TrieNode node,ArrayList<String> list,String str){
        if(node.isEnd == true){
            list.add(str);
        }
        for(int i = 0; i < 26; i++){
            if(node.children[i] != null){
                int x = i + 'a';
                wordSearch(node.children[i],list,str +(char)x);
            }
        }
    }
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        TrieNode root = new TrieNode();
        for(String str : contact){
            insert(str,root);
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(int i = 1; i <= s.length(); i++){
            String sub = s.substring(0,i);
            TrieNode node = prefixSearch(sub,root);
            ArrayList<String> list = new ArrayList<>();
            if(node == null){
                list.add("0");
            }
            else{
                wordSearch(node,list,sub);
            }
            res.add(list);
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/phone-directory4628/1/