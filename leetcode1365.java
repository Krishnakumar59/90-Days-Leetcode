class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int count;
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            array[i] = count;
        }
        return array;
    }
}