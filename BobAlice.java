import java.util.Stack;

public class BobAlice {

    public static void function(String str1, String str2) {
        if (!str1.contains(String.valueOf("#"))) {
            System.out.println("NO");
            return;
        }
        if (!str2.contains(String.valueOf("#"))) {
            System.out.println("NO");
            return;
        }

        Stack<Character> s = new Stack<>();
        Stack<Character> s1 = new Stack<>();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == '#') {
                s.pop();
            } else {
                s.push(ch1[i]);
            }
        }

        for (int i = 0; i < ch2.length; i++) {
            if (ch2[i] == '#') {
                s1.pop();
            } else {
                s1.push(ch2[i]);
            }
        }
        if (s.equals(s1)) {
            System.out.println("YES");
            return;
        } else {
            System.out.println("NO");
            return;
        }

    }

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "ab#c";
        function(str1, str2);
    }
}
