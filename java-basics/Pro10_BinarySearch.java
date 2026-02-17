public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int start = 0;
        int end = numbers.length - 1;
        boolean found = false;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } 
            else if (numbers[mid] < key) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}
