package octChallenge;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        //int mid = nums.length - k-1;
        if(k>nums.length)
            k = k -nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int l, int h) {
        while(l < h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++; h--;
        }
    }
}
