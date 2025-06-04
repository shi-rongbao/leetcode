import java.util.HashSet;
import java.util.Set;

/**
 * @author: ShiRongbao
 * @date: 2025-06-04
 * @description:
 */
public class Hot100_3_LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int current = 0;

        Set<Character> set = new HashSet<>();
        char[] charArray = s.toCharArray();

        int left = 0;
        int right = 0;

        int length = charArray.length;
        for (; right < length; right++) {
            while (left < right && set.contains(charArray[right])) {
                set.remove(charArray[left]);
                left++;
                current--;
            }
            set.add(charArray[right]);
            current++;
            result = Math.max(result, current);
        }

        return result;
    }

}
