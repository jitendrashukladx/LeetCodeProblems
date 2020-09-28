import java.util.HashMap;

public class SumOfTwo {
        public int[] twoSum(int[] nums, int target) {
            int start = nums[0];
            int index[] = new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i<nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    index[0] = map.get(nums[i]);
                    index[1] = i;
                    break;
                } else
                    map.put(target-nums[i], i);
            }
            return index;
        }
}
