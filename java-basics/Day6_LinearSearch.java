public class Day6_LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 20, 25};
        int key = 12;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }
}
