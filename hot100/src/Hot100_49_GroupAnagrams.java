import java.util.*;

/**
 * @author: ShiRongbao
 * @date: 2025-06-03
 * @description:
 */
public class Hot100_49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // 标准化
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                map.put(key, new ArrayList<>(List.of(str)));
            }
        }
        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        Hot100_49_GroupAnagrams solution = new Hot100_49_GroupAnagrams();

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);

        // 打印结果
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
