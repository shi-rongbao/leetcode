/**
 * @author: ShiRongbao
 * @date: 2025-06-03
 * @description:
 */
public class Hot100_11_MaxArea {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int result = 0;

        while (left != right) {
            int temp = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, temp);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

}
