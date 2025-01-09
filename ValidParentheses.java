import java.util.Stack;

public class ValidParentheses {

    static void function(String str) {

        Stack<Character> s = new Stack<>();
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                s.push(ch[i]);
            } else {

                char top = s.peek();
                if ((ch[i] == ')' && top == '(') || (ch[i] == '}' && top == '{') || (ch[i] == ']' && top == '[')) {
                    s.pop();
                } else {
                    System.out.println("inValid Parentheses");
                    return;
                }
            }
        }
        if (s.empty()) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("inValid Parentheses");

        }

    }

    public static void main(String strs[]) {
        String str = "({[]]})";
        function(str);
    }
}
