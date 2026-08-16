class MyHashMap {
     List<List<Integer>> data;

    public MyHashMap() {
        data=new ArrayList<>();
    }
    public void put(int key, int value) {
        for (List<Integer> p : data) {
            if (p.get(0) == key) {
                p.set(1, value);
                return;
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(key);
        ans.add(value);
        data.add(ans);
        
    }
    public int get(int key) {
        for(List<Integer> p:data){
           if(p.get(0)==key){
            return p.get(1);
           }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(List<Integer> p:data){
            if(p.get(0)==key){
                data.remove(p);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */