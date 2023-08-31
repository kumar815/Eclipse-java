import java.util.*;

class Solution {
    public boolean isReflected(int[][] points) {
        if (points.length == 0) {
            return true;
        }

        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        Map<List<Integer>, Integer> point = new HashMap<>();

        for (int[] p : points) {
            List<Integer> key = Arrays.asList(p[0], p[1]);

            if (!point.containsKey(key)) {
                point.put(key, 1);
            }

            int x = p[0];
            if (x < xMin) {
                xMin = x;
            }
            if (x > xMax) {
                xMax = x;
            }
        }

        int middle = (xMax + xMin) / 2;

        for (int[] p : points) {
            int x = p[0];
            int y = p[1];
            int exp = 2 * middle - x;
            List<Integer> key = Arrays.asList(exp, y);
            Integer val = point.get(key);

            if (val != null) {
                if (val > 1) {
                    point.put(key, val - 1);
                } else {
                    point.remove(key);
                }
            }
        }

        return point.isEmpty();
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] points = {{-16, 1}, {16, 1}, {16, 1}};
        System.out.println(obj.isReflected(points));
    }
}