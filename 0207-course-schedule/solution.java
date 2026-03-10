class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count = 0;
        // [1] -> [0]

        // 1 -> [x, x ,x] after learn 1, i can learn
        List<List<Integer>> graph = new ArrayList<>();

        int[] in = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] relation : prerequisites) {
            graph.get(relation[1]).add(relation[0]);
            in[relation[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            count++;

            List<Integer> canLearns = graph.get(cur);
            for (int learn : canLearns) {
                in[learn]--;

                if (in[learn] == 0) {
                    q.offer(learn);
                }
            }
        }

        return count == numCourses;
    }
}
