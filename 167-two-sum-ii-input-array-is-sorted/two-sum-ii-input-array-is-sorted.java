class Solution {
    public int[] twoSum(int[] a, int t) {
        Arrays.sort(a);
		int l = 0;
		int r = a.length - 1;
		while (l<r) {
			int s = a[l]+a[r];
			if (s == t) {
				return new int[]{l+1,r+1};
			}
			else if (s<t) {
				l++;
			}
			else {
				r--;
			}
		}
		
		return new int[]{-1,-1};
    }
}