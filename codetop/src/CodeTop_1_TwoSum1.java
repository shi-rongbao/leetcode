import java.util.HashMap;
import java.util.Map;

/**
 * @author: ShiRongbao
 * @date: 2025-06-03
 * @description:
 */
public class CodeTop_1_TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
