public class ReverseWords {

    // Function to reverse words in a string
    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");

        // Use a StringBuilder to reverse each word
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }

        // Trim the trailing space and return
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World from Java";
        String result = reverseWords(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + result);
    }
}
