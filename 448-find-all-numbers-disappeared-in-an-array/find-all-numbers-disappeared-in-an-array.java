class Solution { 
    public List<Integer> findDisappearedNumbers(int[] nums) { 
        int n = nums.length; 
        List<Integer> ans = new ArrayList<>();

        boolean[] found = new boolean[n + 1];

        for(int i = 0; i < n; i++) {
            found[nums[i]] = true;
        }

        for(int k = 1; k <= n; k++) {
            if(found[k] == false) {
                ans.add(k);
            }
        }

        return ans;
    } 
}