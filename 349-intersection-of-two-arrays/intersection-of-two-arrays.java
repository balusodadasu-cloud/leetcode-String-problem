class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (res.size() == 0 || res.get(res.size() - 1) != nums1[i]) {
                    res.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] ans = new int[res.size()];

        for (int k = 0; k < res.size(); k++) {
            ans[k] = res.get(k);
        }

        return ans;
    }
}
    