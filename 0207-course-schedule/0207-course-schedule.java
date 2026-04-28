class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) q.add(i);
        }

        int count = 0;

        while(!q.isEmpty()) {
            int curr = q.poll();
            count++;

            for(int neighbor : graph.get(curr)) {
                indegree[neighbor]--;
                if(indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        return count == numCourses;
    }
}