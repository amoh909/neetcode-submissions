class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        int n = s.length();
        if (n == 0)
            return true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                myStack.push(s.charAt(i));
            } else {
                if (myStack.isEmpty() || !((s.charAt(i) == ')' && myStack.pop() == '(')
                        || (s.charAt(i) == '}' && myStack.pop() == '{')
                        || (s.charAt(i) == ']' && myStack.pop() == '['))) {
                    return false;
                }
            }
        }
        if (myStack.isEmpty()) return true;
        return false;
    }
}
