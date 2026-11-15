class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);

            // 1. Push opening brackets
            if (curr == '(' || curr == '[' || curr == '{') {
                st.push(curr);
            } else {
                // 2. If a closing bracket appears when the stack is empty, it's invalid
                if (st.empty()) {
                    return false;
                }

                // 3. Check if the top of the stack matches the closing bracket
                char top = st.peek();
                if ((curr == ')' && top == '(') ||
                    (curr == ']' && top == '[') ||
                    (curr == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false; // Mismatched bracket pair
                }
            }
        }

        // 4. Valid only if every opening bracket was matched and popped
        return st.empty();
    }
}
