/**
 * @author: ShiRongbao
 * @date: 2025-06-04
 * @description:
 */
public class Hot100_42_Trap {

    public int trap(int[] height) {
        int n = height.length;
        int result = 0;

        // 初始化两个指针
        int left = 0;
        int right = n - 1;

        // 初始化两个临时的最大容量
        int maxL = height[0];
        int maxR = height[n - 1];

        while (left < right) {
            if (maxL < maxR) {
                left++;
                maxL = Math.max(maxL, height[left]);
                result += (maxL - height[left]);
            } else {
                right--;
                maxR = Math.max(maxR, height[right]);
                result += (maxR - height[right]);
            }
        }

        return result;
    }

}
