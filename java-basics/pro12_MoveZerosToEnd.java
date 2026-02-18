public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 0, 3, 12};

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[index++] = numbers[i];
            }
        }

        while (index < numbers.length) {
            numbers[index++] = 0;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
