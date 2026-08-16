class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> keys=new HashMap<>();
       List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String k=new String(ch);
            if(keys.containsKey(k)){
                List<String> ans=keys.get(k);
                ans.add(strs[i]);
            }
            else{
            List<String> list = new ArrayList<>();
          list.add(strs[i]);
            keys.put(k, list);
            }
        }
        res.addAll(keys.values());
       return res;
    }
}
