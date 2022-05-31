class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();
            List<Integer> inner;
            List<Integer> pre = null;
            
            	for (int i = 0; i < numRows; ++i) {
			inner = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					inner.add(1);
				else
					inner.add(pre.get(j - 1) + pre.get(j));
			pre = inner;
			outer.add(inner);
		}
		return outer;
    }
}