class MyHashSet {
private int[] set;
    public MyHashSet() {
        set = new int[1000001];
        Arrays.fill(set,0);
    }
    
    public void add(int key) {
            set[key] = 1;
        
    }
    
    public void remove(int key) {
        set[key] = 0;
    }
    
    public boolean contains(int key) {
        return set[key] !=1 ? false:true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */