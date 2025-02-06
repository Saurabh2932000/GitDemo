public class SwapString {

    public static void swapFun(String str, String str1) {
        int len = str.length();
        str = str + str1;
        str1 = str.substring(0, len);
        str = str.substring(len);

        System.out.println("String 1 =" + str);
        System.out.println("String 2 =" + str1);

    }

    public static void main(String args[]) {

        String str = "Hello";
        String str1 = "World";

        swapFun(str, str1);
    }
}
