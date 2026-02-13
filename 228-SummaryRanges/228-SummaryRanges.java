// Last updated: 2/13/2026, 11:33:15 AM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> r = new ArrayList<>();

        if (nums.length == 0) return r;

        int s = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                // close previous range
                if (s == nums[i - 1]) {
                    r.add(String.valueOf(s));
                } else {
                    r.add(s + "->" + nums[i - 1]);
                }
                s = nums[i]; // start new range
            }
        }

        // Add FINAL range after loop
        if (s == nums[nums.length - 1]) {
            r.add(String.valueOf(s));
        } else {
            r.add(s + "->" + nums[nums.length - 1]);
        }

        return r;
    }
}
