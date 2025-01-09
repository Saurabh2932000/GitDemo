import java.util.Arrays;

public class AnagramP {

    public void function(String str1, String str2) {

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        String str3 = "";
        String str4 = "";
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            str3 = str3 + ch1[i];
        }
        for (int i = 0; i < ch2.length; i++) {
            str4 = str4 + ch2[i];
        }

        str3.toLowerCase();
        str4.toLowerCase();

        if (str3.equals(str4)) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram");

        }

    }

    public static void main(String args[]) {
        AnagramP a = new AnagramP();
        String str1 = "heart";
        String str2 = "earth";
        a.function(str1, str2);
    }
}
