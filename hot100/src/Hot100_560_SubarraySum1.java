/**
 * @author: ShiRongbao
 * @date: 2025-06-06
 * @description:
 */
public class Hot100_560_SubarraySum1 {

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end >= 0; end--) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

}
