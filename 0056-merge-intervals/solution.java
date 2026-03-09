class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int curStart = intervals[i][0];
            int curEnd = intervals[i][1];

            if (curStart <= end) {
                end = Math.max(end, curEnd);
            } else {
                res.add(new int[] { start, end });
                start = curStart;
                end = curEnd;
            }
        }

        res.add(new int[] { start, end });

        return res.toArray(int[][]::new);
    }
}
