

class Solution {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        
        for (String dir : components) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.insert(0, "/" + dir);
        }
        
        return result.length() == 0 ? "/" : result.toString();
    }
}