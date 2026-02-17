public class Day4_SumAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;

// print the sum and average values
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
