import java.util.Stack;

public class A_Number_following_a_pattern {
    public static String printMinNumberForPattern(String S) {
        int n = S.length();
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            stack.push(i + 1);

            if (i == n || S.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(printMinNumberForPattern("D"));      // Output: 21
        System.out.println(printMinNumberForPattern("IIDDD"));  // Output: 126543
    }
}
