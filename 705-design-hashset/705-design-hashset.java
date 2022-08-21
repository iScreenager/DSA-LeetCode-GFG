class MyHashSet {
        
ArrayList<LinkedList<Integer>> list;
        int size = 100;
    public MyHashSet() {
            list = new ArrayList<>(size);
            for(int i=0;i<size;i++){
                    list.add(new LinkedList<Integer>());
            }
        
    }
        public int hash(int key) {
		return key % list.size();
	}
        public int search(int key) {
		int i = hash(key);

		LinkedList<Integer> temp = list.get(i);
		int ans = -1;

		for (int j = 0; j < temp.size(); j++) {
			if (key == temp.get(j)) {
				return j;
			}
		}
		return ans;
	}

    
    public void add(int key) {
            if (search(key) == -1) {
			int i = hash(key);
			// we add the key at the end in O(1) Time Complexity
			list.get(i).add(key);
		}
        
    }
    
    public void remove(int key) {
            if (search(key) != -1) {
			int i = hash(key);
			list.get(i).remove(Integer.valueOf(key));
		}
        
    }
    
    public boolean contains(int key) {
        return search(key) != -1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */