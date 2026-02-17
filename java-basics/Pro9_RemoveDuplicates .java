public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};

        int index = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                numbers[index++] = numbers[i];
            }
        }

        numbers[index++] = numbers[numbers.length - 1];

        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
