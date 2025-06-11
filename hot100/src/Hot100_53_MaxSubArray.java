/**
 * @author: ShiRongbao
 * @date: 2025-06-11
 * @description:
 */
public class Hot100_53_MaxSubArray {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int res = nums[0];

        for (int num : nums) {
            pre = Math.max(pre + num, num);
            res = Math.max(res, pre);
        }

        return res;
    }

}
