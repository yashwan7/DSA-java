public class minimumcostpathwithalternatingdirections3 {

    public long minCost(int m, int n, int[][] penalty) {
        int total = m * n;
        long[] dist = new long[total * 2];
        Arrays.fill(dist, Long.MAX_VALUE);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        long start = entry(0, 0);
        dist[1] = start; // (0*n+0)*2+1
        pq.offer(new long[]{start, 0, 0, 1});

        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0}; // 0,1=right,left ; 2,3=down,up

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long cost = cur[0];
            int i = (int) cur[1], j = (int) cur[2], p = (int) cur[3];
            int state = (i * n + j) * 2 + p;
            if (cost > dist[state]) continue;
            if (i == m - 1 && j == n - 1) return cost;

            // wait
            long wCost = cost + penalty[i][j];
            int wState = (i * n + j) * 2 + (1 - p);
            if (wCost < dist[wState]) {
                dist[wState] = wCost;
                pq.offer(new long[]{wCost, i, j, 1 - p});
            }

            // moves
            for (int d = 0; d < 4; d++) {
                int ni = i + dr[d], nj = j + dc[d];
                if (ni < 0 || ni >= m || nj < 0 || nj >= n) continue;
                boolean rightOrDown = (d == 0 || d == 2);
                boolean follows = (p == 1 && rightOrDown) || (p == 0 && !rightOrDown);
                long mCost = entry(ni, nj);
                if (!follows) mCost += penalty[i][j];
                long nCost = cost + mCost;
                int nState = (ni * n + nj) * 2 + (1 - p);
                if (nCost < dist[nState]) {
                    dist[nState] = nCost;
                    pq.offer(new long[]{nCost, ni, nj, 1 - p});
                }
            }
        }
        return -1;
    }

    private long entry(int i, int j) {
        return (long) (i + 1) * (j + 1);
    }
}

