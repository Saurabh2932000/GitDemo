import java.util.HashSet;
import java.util.Set;

public class DuplicateWordInString {

    public static void main(String args[]) {

        String string = "Big black bug bit a big black dog on his big black nose";

        String arr[] = string.split(" ");

        Set<String> str = new HashSet<>();
        Set<String> str1 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!str.contains(arr[i])) {
                str.add(arr[i]);

            } else {
                str1.add(arr[i]);
            }
        }

        System.out.println("Duplicate Word in string:-");
        System.out.println(str1.toString());
    }
}
