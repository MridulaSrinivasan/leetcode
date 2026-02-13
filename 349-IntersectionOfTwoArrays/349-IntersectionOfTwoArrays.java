// Last updated: 2/13/2026, 11:33:03 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // add all elements of nums1 to set
        for (int num : nums1) {
            set.add(num);
        }

        // check nums2 for intersection
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // convert set to int[]
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}
