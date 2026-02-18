public class LeftRotateByOne {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int first = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = first;

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
