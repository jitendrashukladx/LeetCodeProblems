//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDupsInplaceInArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        if (nums.length == 0 || nums.length == 1)
            return nums.length;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]!=nums[i+1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length-1];
        return j;
    }
}
