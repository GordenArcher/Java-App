public class TravelingSalesman {
    private static int V = 4;
    private static int[][] graph = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };
    private static int minPath = Integer.MAX_VALUE;

    public static void tsp(int[] path, boolean[] visited, int currPos, int count, int cost) {
        if (count == V && graph[currPos][0] > 0) {
            minPath = Math.min(minPath, cost + graph[currPos][0]);
            return;
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i] && graph[currPos][i] > 0) {
                visited[i] = true;
                tsp(path, visited, i, count + 1, cost + graph[currPos][i]);
                visited[i] = false;
            }
        }
    }

    public static void runTravelingSalesman() {
        int[] path = new int[V];
        boolean[] visited = new boolean[V];
        visited[0] = true;

        long startTime = System.nanoTime();
        tsp(path, visited, 0, 1, 0);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime); // in nanoseconds
        System.out.println("Minimum Path Cost: " + minPath);
        System.out.println("Running Time: " + duration + " nanoseconds");
    }
}
