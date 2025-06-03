import java.util.HashSet;

/**
 * @author: ShiRongbao
 * @date: 2025-06-03
 * @description:
 */
public class Hot100_128_LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        // 将数组放到set集合中（去重）
        for (int num : nums) {
            set.add(num);
        }

        int count = 0;
        int res = 0;

        // 遍历集合
        for (int num : set) {
            // 如果集合中不存在num - 1这个数字，那么说明 num 是头，第一个数字！
            // 要从头开始数！
            if (!set.contains(num - 1)) {
                count = 1;
                int cur = num;
                while (set.contains(cur + 1)) {
                    count++;
                    cur++;
                }

                // 计算全局结果与当前的count哪个更大！
                res = Math.max(res, count);
            }
        }

        return res;
    }

}
