class Solution {
    public int findTheWinner(int n, int k) {
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            visited[i] = false;
        }

        int i = 0;
        int end = 0;

        while (end < n - 1) {
            for (int j = 0; j < k - 1; j++) {
                i = nextIndex(visited, i);
            }
            visited[i] = true;
            end++;
            i = nextIndex(visited, i);
        }

        return arr[i];
    }

    public int nextIndex(boolean[] visited, int i) {
        do {
            i = (i + 1) % visited.length;
        } while (visited[i] != false);

        return i;
    }
}
