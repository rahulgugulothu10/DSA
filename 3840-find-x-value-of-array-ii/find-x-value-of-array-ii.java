class Solution {
int[][] tree;    
int[] totalProd;
long currentP;
int totalCount;
void build(int node, int l, int r, int[] nums, int k) {
if (l == r) {   
totalProd[node] = nums[l] % k;
tree[node] = new int[k];
tree[node][nums[l] % k] = 1;
return;
}
int mid = (l + r) / 2;
build(2 * node, l, mid, nums, k);
build(2 * node + 1, mid + 1, r, nums, k);
merge(node, k);
}
void merge(int node, int k) {
int left = 2 * node;    
int right = 2 * node + 1;
totalProd[node] = (int) ((1L * totalProd[left] * totalProd[right]) % k);
int[] leftCounts = tree[left];
int[] rightCounts = tree[right];
int[] resCounts = new int[k];
System.arraycopy(leftCounts, 0, resCounts, 0, k);
long lp = totalProd[left];
for (int j = 0; j < k; j++) {
if (rightCounts[j] > 0) {   
int nextRem = (int) ((lp * j) % k);
resCounts[nextRem] += rightCounts[j];
}
}
tree[node] = resCounts;
}
void update(int node, int l, int r, int idx, int val, int k) {
if (l == r) {   
totalProd[node] = val % k;
tree[node] = new int[k];
tree[node][val % k] = 1;
return;
}
int mid = (l + r) / 2;
if (idx <= mid) {
update(2 * node, l, mid, idx, val, k);    
} else {
update(2 * node + 1, mid + 1, r, idx, val, k);    
}
merge(node, k);
}
void query(int node, int l, int r, int ql, int qr, int k, int x) {
if (ql <= l && r <= qr) { 
for (int j = 0; j < k; j++) {
if ((currentP * j) % k == x) { 
totalCount += tree[node][j];
}
}
currentP = (currentP * totalProd[node]) % k;
return;
}
int mid = (l + r) / 2;
if (ql <= mid) {
query(2 * node, l, mid, ql, qr, k, x);    
}
if (qr > mid) {
query(2 * node + 1, mid + 1, r, ql, qr, k, x);    
}
}
public int[] resultArray(int[] nums, int k, int[][] queries) {
int n = nums.length;    
int treeSize = 4 * n;
tree = new int[treeSize][];
totalProd = new int[treeSize];
build(1, 0, n - 1, nums, k);
int[] results = new int[queries.length];
for (int i = 0; i < queries.length; i++) {
update(1, 0, n - 1, queries[i][0], queries[i][1], k);    
currentP = 1;
totalCount = 0;
query(1, 0, n - 1, queries[i][2], n - 1, k, queries[i][3]);
results[i] = totalCount;
}
return results;
}
}