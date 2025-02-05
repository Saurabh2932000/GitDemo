public class MissingNumber {

    public static void findNumber(int arr[]) {

        int start = arr[0], end = arr[arr.length - 1];
        int sum = 0, sum1 = 0;
        for (int i = 0, j = start; i < arr.length && j <= end - 1; i++, j++) {
            sum1 = sum1 + arr[i];
            sum = sum + j;
        }
        sum = sum + end;
        System.out.println("Missing Number In Array Is:- " + (sum - sum1));

        // for (int i = 0; i < arr.length - 1; i++) {
        // int j = 0;
        // j = i + 1;
        // sum = arr[j] - arr[i];
        // if (sum != 1) {
        // System.out.println("Missing Number In Array Is:- " + (arr[i] + 1));
        // break;
        // }
        // }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
        findNumber(arr);
    }
}
