// Last updated: 2/13/2026, 11:32:51 AM
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop(); // Invalidate last score
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek()); // Double last score
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek(); // Sum of last two
                stack.push(top); // Push back the one we popped
                stack.push(newScore);
            } else {
                stack.push(Integer.parseInt(op)); // Convert string to int
            }
        }

        // Sum all elements in the stack
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}
   
    