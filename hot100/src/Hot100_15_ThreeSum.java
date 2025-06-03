import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: ShiRongbao
 * @date: 2025-06-03
 * @description:
 */
public class Hot100_15_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int length = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }

            // 对第一个数进行去重
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = length - 1;

            while (right > left) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);

                    // 对第二个数进行去重
                    while (right> left && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // 对第三个数进行去重
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    right--;
                    left++;
                }
            }
        }

        return result;
    }

}