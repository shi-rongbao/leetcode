import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: ShiRongbao
 * @date: 2025-06-11
 * @description:
 */
public class Hot100_56_Merge {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[][]{};
        }

        /*
        // 简化写法
          Arrays.sort(intervals,new Comparator<int[]> (){
                      public int compare(int[] arr1, int[] arr2) {
                          return arr1[0] - arr2[0];
                      }
                  });
         */
        // 给二维数组排序，把区间从小到大排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (result.isEmpty() || result.get(result.size() - 1)[1] < start) {
                result.add(new int[]{start, end});
            } else {
                result.get(result.size() - 1)[1] = Math.max(end, result.get(result.size() - 1)[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

}
