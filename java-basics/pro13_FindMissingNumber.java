public class FindMissingNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5};
        int n = 5;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : numbers) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}
