class Solution {
private int m, n;    
private boolean[][][] visited;
public boolean hasValidPath(char[][] grid) {
m = grid.length;    
n = grid[0].length;
if ((m + n - 1) % 2 != 0) return false;
visited = new boolean[m][n][m + n];
return dfs(0, 0, 0, grid);
}
private boolean dfs(int r, int c, int bal, char[][] grid) {
if (grid[r][c] == '(') {
bal++;
} else {
bal--;
}
if (bal < 0 || bal >= m + n) return false;
if (r == m - 1 && c == n - 1) return bal == 0;
if (visited[r][c][bal]) return false;
visited[r][c][bal] = true;
if (r + 1 < m && dfs(r + 1, c, bal, grid)) return true;
if (c + 1 < n && dfs(r, c + 1, bal, grid)) return true;
return false;
}
}