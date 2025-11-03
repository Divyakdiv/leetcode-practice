import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int res = 0;
        int sign = 1;              
        Stack<Integer> stack = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = c - '0';
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(++i) - '0');
                }
                res += sign * num;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(res);
                stack.push(sign);  
                res = 0;
                sign = 1;
            } else if (c == ')') {
                int prevSign = stack.pop();
                int prevRes = stack.pop();
                res = prevRes + prevSign * res;
            } // ignore spaces
        }

        return res;
    }
}